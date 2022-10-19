package pe.edu.upc.tfsafeport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfsafeport.entities.Padredefamilia;
import pe.edu.upc.tfsafeport.servicesinterfaces.IPadredefamiliaService;

import java.util.List;
@RestController
@RequestMapping("/padresdefamilia")
public class PadredefamiliaController {
    @Autowired
    private IPadredefamiliaService pService;

    @PostMapping
    public void registrar(@RequestBody Padredefamilia p){
        pService.insert(p);
    }

    @GetMapping
    public List<Padredefamilia> listar() {return pService.list();}
}
