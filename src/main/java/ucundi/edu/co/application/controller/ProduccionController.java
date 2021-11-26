package ucundi.edu.co.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ucundi.edu.co.application.model.Produccion;
import ucundi.edu.co.application.repositories.ProduccionRepository;
import ucundi.edu.co.application.services.ProducionService;

@RestController
@RequestMapping("/Produccion")
@CrossOrigin(origins = "*")
public class ProduccionController {
    
    @Autowired
    private ProducionService producionService;

    @Autowired
    private ProduccionRepository produccionRepository;
    

    /* @GetMapping("/all")
    public List<Produccion> getAll(){
        return producionService.getAll();
    } */

    @GetMapping("/all")
    ModelAndView index(){
        List<Produccion> produccions = produccionRepository.getAll();

        return new ModelAndView("index").addObject("produccions", produccions);
    }

    @GetMapping("{id}")
    public Optional<Produccion> getProduccion(@PathVariable int id){
        return producionService.getProduccion(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Produccion save(@RequestBody Produccion produccion){
        return producionService.save(produccion);
    }
        
}
