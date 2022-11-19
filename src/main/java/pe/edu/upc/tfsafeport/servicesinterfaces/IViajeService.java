package pe.edu.upc.tfsafeport.servicesinterfaces;


import pe.edu.upc.tfsafeport.entities.Respuesta;

import pe.edu.upc.tfsafeport.entities.CantidadViajesXFecha;

import pe.edu.upc.tfsafeport.entities.Viaje;


import java.util.List;
import java.util.Optional;

public interface IViajeService {

    public boolean Insert(Viaje viaje);

    List<Viaje>list();

    public void delete(int idViaje);

    public Optional<Viaje>listarId(int idViaje);

    List<Viaje> buscarVehiculo(String placa);
    List<Viaje> search(String horainicio);

    List<Viaje> buscarfecha(String fecha);


    List<Viaje> buscarFechaMayor();

    List<Respuesta> buscarCantidadViajes();

    List<CantidadViajesXFecha> searchCantidad();


}
