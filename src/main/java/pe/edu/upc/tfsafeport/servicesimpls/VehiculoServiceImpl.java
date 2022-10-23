package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Vehiculo;
import pe.edu.upc.tfsafeport.repositories.IVehiculoRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IVehiculoService;

import java.util.List;
import java.util.Optional;

    @Service
    public class VehiculoServiceImpl implements IVehiculoService {

        @Autowired
        private IVehiculoRepository uR;

        @Override
        public void insert(Vehiculo vehiculo) {
            uR.save(vehiculo);
        }

        @Override
        public List<Vehiculo> list() {
            return uR.findAll();
        }
        @Override
        public Optional<Vehiculo> ListarId(int id) {
            return Optional.of(uR.findById(id).orElse(new Vehiculo()));
        }

        @Override
        public void delete(int id){uR.deleteById(id);}

        @Override
        public List<Vehiculo> search(String placa) {
            return uR.search(placa);
        }
    }

