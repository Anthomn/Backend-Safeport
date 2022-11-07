package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Estado;
import pe.edu.upc.tfsafeport.servicesinterfaces.IEstadoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class EstadoController {
    @Autowired
    private IEstadoService eService;

    @PostMapping
    public void registrar(@RequestBody Estado e) {
        eService.insert(e);
    }

    @GetMapping
    public List<Estado> listar() {
        return eService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Estado estado) {
        eService.insert(estado);
    }
    @PostMapping("/buscar")
    public List<Estado>buscar(@RequestBody Estado estado){
        List<Estado> lista;
        estado.setDireccionPartida(estado.getDireccionPartida());
        lista=eService.search(estado.getDireccionPartida());
        if (lista.isEmpty()){
            lista=eService.buscarViajes(estado.getViaje().getHorainicio());
            lista=eService.buscarSolicitud(estado.getSolicitud().getDescripcion());
            lista=eService.buscarUbicacion(estado.getUbicacion().getDistrito());
        }
        return lista;

    }
     @GetMapping("/{id}")
    public Optional<Estado> listarId(@PathVariable("id")Integer id){
        return eService.listarId(id);
     }
}

