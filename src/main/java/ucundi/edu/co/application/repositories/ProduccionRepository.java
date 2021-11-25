package ucundi.edu.co.application.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ucundi.edu.co.application.model.Produccion;
import ucundi.edu.co.application.repositories.crud.ProduccionCrudRepository;

@Repository
public class ProduccionRepository {
    
    @Autowired
    private ProduccionCrudRepository produccionCrudRepository;

    public List<Produccion> getAll(){
        return (List<Produccion>) produccionCrudRepository.findAll();
    }

    public Optional<Produccion> getProduccion(int id){
        return produccionCrudRepository.findById(id);
    }

    public Produccion save(Produccion produccion){
        return produccionCrudRepository.save(produccion);
    }

}
