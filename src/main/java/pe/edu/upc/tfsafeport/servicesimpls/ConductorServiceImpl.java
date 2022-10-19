package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.repositories.IConductorRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IConductorService;

import java.util.List;
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
}
