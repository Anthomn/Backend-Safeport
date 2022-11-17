package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Marca;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {

    public void insert(Marca marca);

    List<Marca> list();

    public void delete(int idMarca);

    public Optional<Marca> listarId(int idMarca);

    List<Marca>search(String nombremarca);

    List<Marca>buscarMarca(String marca);
}
