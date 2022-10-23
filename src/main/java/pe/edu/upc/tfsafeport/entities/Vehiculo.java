package pe.edu.upc.tfsafeport.entities;

import javax.persistence.*;

@Entity
@Table (name = "Vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "placa", length = 10, nullable = false)
    private String placa;
    @Column(name = "color", length = 20, nullable = false)
    private String color;
    @Column(name = "estado", length = 1, nullable = false)
    private String estado;
    @Column(name = "marca", length = 20, nullable = false)
    private String marca;
    @Column(name = "caracteristica", length = 255, nullable = false)
    private String caracteristica;

    @Column(name = "aniomodelo", length = 5,nullable = false)
    private String aniomodelo;



    public Vehiculo (){}
    public Vehiculo(int id, String placa, String color, String estado, String marca, String caracteristica) {
        Id = id;
        this.placa = placa;
        this.color = color;
        this.estado = estado;
        this.marca = marca;
        this.caracteristica = caracteristica;
        this.aniomodelo= aniomodelo;

    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAniomodelo() {
        return aniomodelo;
    }

    public void setAniomodelo(String aniomodelo) {
        this.aniomodelo = aniomodelo;
    }
}
