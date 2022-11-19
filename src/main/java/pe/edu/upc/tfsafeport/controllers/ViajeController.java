package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Viaje;
import pe.edu.upc.tfsafeport.servicesinterfaces.IViajeService;
import pe.edu.upc.tfsafeport.entities.CantidadViajesXFecha;

import java.util.Optional;
import java.util.List;


@RestController
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private IViajeService vService;

    @PostMapping
    public void registrar(@RequestBody Viaje v){
        vService.Insert(v);
    }

    @GetMapping
    public List<Viaje> listar() {return vService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {vService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Viaje viaje){vService.Insert(viaje);}

    @PostMapping("/buscar")
    public List<Viaje> search(@RequestBody Viaje viaje)
    {
        List<Viaje> lista;
        viaje.setHorainicio(viaje.getHorainicio());
        lista=vService.search(viaje.getHorainicio());
        if (lista.isEmpty()) {

            lista = vService.buscarVehiculo(viaje.getVehiculo().getPlaca());
        }
        return lista;
    }
    @GetMapping("/{id}")
    public Optional<Viaje> listarId(@PathVariable("id") Integer id) {
        return vService.listarId(id);
    }

    @PostMapping("/buscarfecha")
    public List<Viaje> buscarfecha(@RequestBody String nombre) {return vService.buscarfecha(nombre);}

    @GetMapping("/cantidad")
    public List<CantidadViajesXFecha> searchCantidad(){
        return vService.searchCantidad();
    }
}
