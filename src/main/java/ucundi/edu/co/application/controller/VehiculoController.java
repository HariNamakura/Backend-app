package ucundi.edu.co.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucundi.edu.co.application.model.Vehiculo;
import ucundi.edu.co.application.services.VehiculoService;

@RestController
@RequestMapping("/Vehiculo")
@CrossOrigin(origins = "*")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/all")
    public List<Vehiculo> getAll() {
        return vehiculoService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Vehiculo> getVehiculo(@PathVariable int id){
        return vehiculoService.getVehiculo(id);
    }
    
}
