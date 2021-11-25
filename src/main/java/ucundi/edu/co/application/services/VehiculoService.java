package ucundi.edu.co.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucundi.edu.co.application.model.Vehiculo;
import ucundi.edu.co.application.repositories.VehiculoRepository;

@Service
public class VehiculoService {
    
    @Autowired
    private VehiculoRepository vehiculoRepository;
    
    public List<Vehiculo>getAll(){
        return vehiculoRepository.getAll();
    }

    public Optional<Vehiculo>getVehiculo(int id){
        return vehiculoRepository.getVehiculo(id);
    }


}
