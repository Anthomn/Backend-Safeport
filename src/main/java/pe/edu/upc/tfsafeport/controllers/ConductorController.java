package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.servicesinterfaces.IConductorService;


import java.util.List;
@RestController
@RequestMapping("/conductores")
public class ConductorController {

    @Autowired
    private IConductorService cService;

    @PostMapping
    public void registrar(@RequestBody Conductor c){
        cService.insert(c);
    }

    @GetMapping
    public List<Conductor> listar() {return cService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Conductor conductor){
        cService.insert(conductor);
    }
    @PostMapping("/buscar")
    public List<Conductor> buscar(@RequestBody Conductor conductor)
    {
        List<Conductor> lista;
        conductor.setNombre(conductor.getNombre());
        lista=cService.search(conductor.getNombre());
        return lista;
    }

}
