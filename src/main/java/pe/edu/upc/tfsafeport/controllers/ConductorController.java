package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.servicesinterfaces.IConductorService;
import pe.edu.upc.tfsafeport.entities.CantidadVehiculoXConductor;
import java.util.Optional;
import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping("/conductor")
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
    public void modificar(@RequestBody Conductor c){
        cService.insert(c);
    }
    @PostMapping("/buscar")
    public List<Conductor> buscar(@RequestBody String nombre) throws ParseException{
        List<Conductor> listaConductores;
        listaConductores = cService.search(nombre);
        return listaConductores;

    }/* TE RETORNA TODA LA TABLA PERO NECESITAR PONER TODOS LOS DATOS DE LA TABLA
    {
        List<Conductor> lista;
        conductor.setNombre(conductor.getNombre());
        lista=cService.search(conductor.getNombre());
        return lista;
    }*/
    @GetMapping("/{id}")
    public Optional<Conductor> listarId(@PathVariable("id") Integer id){
        return  cService.listarId(id);
    }

    @PostMapping("/buscarnombre")
    public List<Conductor> buscarnombre(@RequestBody String nombre) {return  cService.buscarnombre(nombre);}

    @GetMapping("/buscarverificado")
    public List<Conductor>buscarverificado(){
        return cService.buscarverificado();
    }

    @GetMapping("/buscartiempo")
    public List<Conductor>buscartiempo() {
        return cService.buscartiempo();
    }
    @GetMapping("/cantidad")
    public List<CantidadVehiculoXConductor> searchCantidad(){
        return cService.searchCantidad();

    }
}
