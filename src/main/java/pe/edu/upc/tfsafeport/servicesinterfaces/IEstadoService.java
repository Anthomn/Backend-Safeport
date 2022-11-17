package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Estado;
import pe.edu.upc.tfsafeport.entities.Solicitud;

import java.util.List;
import java.util.Optional;

public interface IEstadoService {
    public boolean insert(Estado estado);
    List<Estado>list();
    public void delete(int idEstado);
    public Optional<Estado>listarId(int idEstado);
    List<Estado>search(String direccionPartida);
    List<Estado> buscarViajes(String horainicio);
    List<Estado> buscarSolicitud(String descripcion);
    List<Estado> buscarUbicacion(String nombre);

    List<Estado> buscarDistrito(String nombre);
}
