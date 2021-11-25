package ucundi.edu.co.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucundi.edu.co.application.model.Servicio;
import ucundi.edu.co.application.services.ServicioService;

@RestController
@RequestMapping("/Servicio")
@CrossOrigin(origins = "*")
public class ServicioController {
    @Autowired
    private ServicioService servicioService;

    @GetMapping("/all")
    public List<Servicio> getAll() {
        return servicioService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Servicio> getServicio(@PathVariable int id){
        return servicioService.getServicio(id);
    }
}
