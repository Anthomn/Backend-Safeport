package pe.edu.upc.tfsafeport.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSolicitud;

    @Column(name = "precio", length = 10, nullable = false)
    private int precio;

    @Column(name = "fecha",nullable = true)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fecha;

    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;

    @Column(name = "fechainicio",nullable = true)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechainicio;

    @Column(name = "fechafin",nullable = true)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechafin;

    @Column(name = "nombrehijo", length = 30, nullable = false)
    private String nombrehijo;

    @Column(name = "edadhijo", length = 5, nullable = false)
    private int edadhijo;

    @Column(name = "direccioncasa", length = 100, nullable = false)
    private String direccioncasa;

    @Column(name = "direccioncolegio", length = 100, nullable = false)
    private String direccioncolegio;

    @Column(name ="estado", length = 10, nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idConductor", nullable = false)
    private Conductor conductor;

    @ManyToOne
    @JoinColumn(name = "idPadrefamilia", nullable = false)
    private Padredefamilia padredefamilia;

    public Solicitud(int idSolicitud, int precio, LocalDate fecha, String descripcion, LocalDate fechainicio, LocalDate fechafin, String nombrehijo, int edadhijo, String direccioncasa, String direccioncolegio, String estado, Conductor conductor, Padredefamilia padredefamilia) {
        this.idSolicitud = idSolicitud;
        this.precio = precio;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.nombrehijo = nombrehijo;
        this.edadhijo = edadhijo;
        this.direccioncasa = direccioncasa;
        this.direccioncolegio = direccioncolegio;
        this.estado = estado;
        this.conductor = conductor;
        this.padredefamilia = padredefamilia;
    }

    public Solicitud() {
        super();
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getNombrehijo() {
        return nombrehijo;
    }

    public void setNombrehijo(String nombrehijo) {
        this.nombrehijo = nombrehijo;
    }

    public int getEdadhijo() {
        return edadhijo;
    }

    public void setEdadhijo(int edadhijo) {
        this.edadhijo = edadhijo;
    }

    public String getDireccioncasa() {
        return direccioncasa;
    }

    public void setDireccioncasa(String direccioncasa) {
        this.direccioncasa = direccioncasa;
    }

    public String getDireccioncolegio() {
        return direccioncolegio;
    }

    public void setDireccioncolegio(String direccioncolegio) {
        this.direccioncolegio = direccioncolegio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Padredefamilia getPadredefamilia() {
        return padredefamilia;
    }

    public void setPadredefamilia(Padredefamilia padredefamilia) {
        this.padredefamilia = padredefamilia;
    }
}
