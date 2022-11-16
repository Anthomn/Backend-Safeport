package pe.edu.upc.tfsafeport.entities;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="Viaje")
public class Viaje {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaje;

    @Column(name = "fecha", length = 30, nullable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fecha;

    @Column(name = "horarinicio", length = 30, nullable = false)
    private String horainicio;

    @Column(name = "horafin", length = 25, nullable = false)
    private String horafin;

    @ManyToOne
    @JoinColumn(name ="idVehiculo",nullable = false)
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Viaje() {
        super();
    }

    public Viaje(int idViaje, LocalDate fecha, String horainicio, String horafin, Vehiculo vehiculo) {
        this.idViaje = idViaje;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.vehiculo = vehiculo;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }
}
