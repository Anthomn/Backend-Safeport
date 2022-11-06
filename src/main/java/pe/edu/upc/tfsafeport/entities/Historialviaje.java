package pe.edu.upc.tfsafeport.entities;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Table(name = "Historialviaje")
public class Historialviaje implements Serializable {

    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistorial;

    @Column(name = "observaciones", length = 250, nullable = false)
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "idViaje",nullable = false)
    private Viaje viaje;

    public Historialviaje() {
        super();
    }

    public Historialviaje(int idHistorial, String observaciones, Viaje viaje) {
        this.idHistorial = idHistorial;
        this.observaciones = observaciones;
        this.viaje = viaje;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
