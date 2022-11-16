package pe.edu.upc.tfsafeport.entities;


import javax.persistence.*;

@Entity
@Table(name = "Marca")

public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;

    @Column(name = "nombremarca", length = 50, nullable = false)
    private String nombremarca;

    public Marca() {
    }

    public Marca(int idMarca, String nombremarca) {
        this.idMarca = idMarca;
        this.nombremarca = nombremarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }
}
