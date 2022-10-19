package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Ubicacion;
import pe.edu.upc.tfsafeport.repositories.IUbicacionRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IUbicacionService;

import java.util.List;
@Service
public class UbicacionServiceImpl implements IUbicacionService {

    @Autowired
    private IUbicacionRepository uR;

    @Override
    public void insert(Ubicacion ubicacion) {
        uR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return uR.findAll();
    }
}
