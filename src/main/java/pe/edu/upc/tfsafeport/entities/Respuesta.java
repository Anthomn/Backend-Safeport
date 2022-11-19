package pe.edu.upc.tfsafeport.entities;

public class Respuesta {



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

    private String id;
    private String conductor;
    private String cantidad;
    private String ingresoMensual;
    private String vehiculo;
    private String cantidadviajes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(String ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Respuesta(String id, String conductor, String cantidad, String ingresoMensual,String vehiculo, String cantidadviajes ) {
        this.id = id;
        this.conductor = conductor;
        this.cantidad = cantidad;
        this.ingresoMensual = ingresoMensual;
        this.vehiculo = vehiculo;
        this.cantidadviajes = cantidadviajes;
    }

    public Respuesta() {
    }
}
