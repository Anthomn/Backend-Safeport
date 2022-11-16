package pe.edu.upc.tfsafeport.servicesimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfsafeport.entities.Marca;
import pe.edu.upc.tfsafeport.repositories.IMarcaRespository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IMarcaService;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements IMarcaService {

    @Autowired
    private IMarcaRespository mR;

    @Override
    public void insert(Marca marca) {
        mR.save(marca);
    }

    @Override
    public List<Marca> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMarca) {
        mR.deleteById(idMarca);
    }

    @Override
    public Optional<Marca> listarId(int idMarca) {
        return Optional.of(mR.findById(idMarca).orElse(new Marca()));
    }

    @Override
    public List<Marca> search(String nombremarca) {
        return mR.search(nombremarca);
    }
}
