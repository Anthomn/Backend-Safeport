package pe.edu.upc.tfsafeport.entities;

public class Respuesta {

    private String vehiculo;

    private String cantidadviajes;

    public Respuesta() {
    }

    public Respuesta(String vehiculo, String cantidadviajes) {
        this.vehiculo = vehiculo;
        this.cantidadviajes = cantidadviajes;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getCantidadviajes() {
        return cantidadviajes;
    }

    public void setCantidadviajes(String cantidadviajes) {
        this.cantidadviajes = cantidadviajes;
    }
}
