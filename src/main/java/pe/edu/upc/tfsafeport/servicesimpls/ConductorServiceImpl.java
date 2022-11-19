package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.repositories.IConductorRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IConductorService;
import pe.edu.upc.tfsafeport.entities.CantidadVehiculoXConductor;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class ConductorServiceImpl implements IConductorService {
    @Autowired
    private IConductorRepository cR;

    @Override
    public void insert(Conductor conductor) {
        cR.save(conductor);
    }

    @Override
    public List<Conductor> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id){
        cR.deleteById(id);
    }

    @Override
     public Optional<Conductor> listarId(int idConductor){
         return Optional.of(cR.findById(idConductor).orElse(new Conductor()));
     }
    @Override
    public List<Conductor> search(String nombre){return cR.search(nombre);
    }

    @Override
    public List<Conductor> buscarnombre(String nombre) {
        return cR.findByNombre(nombre);
    }


    @Override
    public List<Conductor> buscarverificado() {
        return cR.buscarverificado();
    }

    @Override
    public List<Conductor> buscartiempo() {
        return cR.buscartiempo();
    }
    @Override
    public List<CantidadVehiculoXConductor> searchCantidad()
    {
        List<CantidadVehiculoXConductor>lista=new ArrayList<>();
        cR.searchCantidad().forEach(

                y->{CantidadVehiculoXConductor r = new CantidadVehiculoXConductor();
                    r.setNombre(y[0]);
                    r.setApellido(y[1]);
                    r.setDni(y[2]);
                    r.setCantidad(y[3]);
                    lista.add(r);

                });
        return lista;

    }
}
