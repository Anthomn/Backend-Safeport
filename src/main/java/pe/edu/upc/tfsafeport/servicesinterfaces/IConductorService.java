package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.entities.Ubicacion;

import java.util.List;
import java.util.Optional;

public interface IConductorService {
    public void insert(Conductor conductor);

    List<Conductor>list();

    public void delete(int id);
    public Optional<Conductor> listarId(int id);
    List<Conductor>search(String nombre);
}
