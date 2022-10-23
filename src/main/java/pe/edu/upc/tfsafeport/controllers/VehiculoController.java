package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Vehiculo;
import pe.edu.upc.tfsafeport.servicesinterfaces.IVehiculoService;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private IVehiculoService vService;

    @PostMapping
    public void registrar(@RequestBody Vehiculo v){
        vService.insert(v);
    }

    @GetMapping
    public List<Vehiculo> listar() {return vService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id") Integer id){
        vService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Vehiculo vehiculo){
        vService.insert(vehiculo);
    }
    @PostMapping("/buscar")
    public List<Vehiculo> buscar(@RequestBody Vehiculo vehiculo){
        List<Vehiculo> lista;
        vehiculo.setPlaca(vehiculo.getPlaca());
        lista=vService.search(vehiculo.getPlaca());
        return lista;
    }
}

