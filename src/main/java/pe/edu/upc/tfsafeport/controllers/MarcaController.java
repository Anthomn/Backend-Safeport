package pe.edu.upc.tfsafeport.controllers;


import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Marca;
import pe.edu.upc.tfsafeport.servicesinterfaces.IMarcaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private IMarcaService mService;

    @PostMapping
    public void registrar(@RequestBody Marca m) {mService.insert(m);}

    @GetMapping
    public List<Marca> listar() {return mService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {mService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Marca m) {mService.insert(m);}

    @PostMapping("/buscar")
    public List<Marca> buscar(@RequestBody String nombremarca) throws ParseException{
        List<Marca> listaMarcas;
        listaMarcas = mService.search(nombremarca);
        return listaMarcas;
    }

    @GetMapping("/{id}")
    public Optional<Marca> listarId(@PathVariable("id") Integer id){return mService.listarId(id);}

    @PostMapping("/buscarmarca")
    public List<Marca> buscarMarca(@RequestBody String marca) {
        return mService.buscarMarca(marca);
    }
}
