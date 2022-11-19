package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.CantidadVehiculoRespuesta;
import pe.edu.upc.tfsafeport.entities.Solicitud;
import pe.edu.upc.tfsafeport.entities.Vehiculo;
import pe.edu.upc.tfsafeport.repositories.IVehiculoRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IVehiculoService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    @Service
    public class VehiculoServiceImpl implements IVehiculoService {

        @Autowired
        private IVehiculoRepository uR;

        @Override
        @Transactional
        public boolean insert(Vehiculo vehiculo) {
            Vehiculo objVehiculo = uR.save(vehiculo);
            if (objVehiculo == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public List<Vehiculo> list() {
            return uR.findAll();
        }
        @Override
        public Optional<Vehiculo> ListarId(int id) {
            return Optional.of(uR.findById(id).orElse(new Vehiculo()));
            //return uR.findById(id);

        }

        @Override
        @Transactional
        public void delete(int id){uR.deleteById(id);}

        @Override
        public List<Vehiculo> search(String placa) {
            return uR.search(placa);
        }

        @Override
        public List<Vehiculo> searchConductor(String nombre) {
            return uR.searchConductor(nombre);
        }

        @Override
        public List<Vehiculo> searchMarca(String nombremarca) {
            return uR.searchMarca(nombremarca);
        }

        @Override
        public List<Vehiculo> buscarPlaca(String placa) {
            return uR.findByPlaca(placa);
        }

        @Override
        public List<Vehiculo> searchEstado() {
            return uR.searchEstado();
        }

        @Override
        public List<CantidadVehiculoRespuesta> searchCantidad() {
            List<CantidadVehiculoRespuesta>lista=new ArrayList<>();
            uR.searchCantidad().forEach(

                    y->{CantidadVehiculoRespuesta r = new CantidadVehiculoRespuesta();
                        r.setMarca(y[0]);
                        r.setCantidad(y[1]);
                        lista.add(r);

                    });
            return lista;
        }


    }

