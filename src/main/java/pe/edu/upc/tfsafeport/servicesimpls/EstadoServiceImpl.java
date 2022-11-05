package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.tfsafeport.entities.Estado;
import pe.edu.upc.tfsafeport.repositories.IEstadoRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IEstadoService;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoServiceImpl implements IEstadoService {
    @Autowired
    private IEstadoRepository eR;
    @Override
    @Transactional

    public boolean insert(Estado estado) {
        Estado objEstado=eR.save(estado);
        if (objEstado==null)
        {
            return false;
        }
        else
        {return true;}
    }

    @Override
    public List<Estado> list() {
        return eR.findAll();
    }

    @Override
    @Transactional
    public void delete(int idEstado) {
        eR.deleteById(idEstado);
    }

    @Override
    public Optional<Estado> listarId(int idEstado) {

        return Optional.of(eR.findById(idEstado).orElse(new Estado()));
        /*
        return Optional.empty();*/
    }

    @Override
    public List<Estado> search(String direccionPartida) {
        return eR.search(direccionPartida);
    }
    @Override
    public List<Estado> buscarViajes(String horainicio){
        return eR.buscarViajes(horainicio);
    }
    @Override
    public List<Estado> buscarSolicitud(String descripcion){
        return eR.buscarSolicitud(descripcion);
    }
    @Override
    public List<Estado> buscarUbicacion(String distrito){
        return eR.buscarUbicacion(distrito);
    }

}
