package pe.edu.upc.tfsafeport.entities;

public class Respuesta {

    private String id;
    private String conductor;
    private String cantidad;
    private String ingresoMensual;

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

    public Respuesta(String id, String conductor, String cantidad, String ingresoMensual) {
        this.id = id;
        this.conductor = conductor;
        this.cantidad = cantidad;
        this.ingresoMensual = ingresoMensual;
    }

    public Respuesta() {
    }
}
