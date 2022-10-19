package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {
    public void insert(Ubicacion ubicacion);

    List<Ubicacion>list();
}
