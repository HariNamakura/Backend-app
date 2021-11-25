package ucundi.edu.co.application.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ucundi.edu.co.application.model.Vehiculo;
import ucundi.edu.co.application.repositories.crud.VehiculoCrudRepository;
 
@Repository
public class VehiculoRepository {
    
    @Autowired
    private VehiculoCrudRepository vehiculoCrudRepository;
    
    public List<Vehiculo>getAll(){
        return (List<Vehiculo>) vehiculoCrudRepository.findAll();
    }

    public Optional<Vehiculo>getVehiculo(int id){
        return vehiculoCrudRepository.findById(id);
    }

    

}
