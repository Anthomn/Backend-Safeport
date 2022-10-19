package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Conductor;

import java.util.List;

public interface IConductorService {
    public void insert(Conductor conductor);

    List<Conductor>list();
}
