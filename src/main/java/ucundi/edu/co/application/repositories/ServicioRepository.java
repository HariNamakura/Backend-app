package ucundi.edu.co.application.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ucundi.edu.co.application.model.Servicio;
import ucundi.edu.co.application.repositories.crud.ServicioCrudRepository;

@Repository
public class ServicioRepository {
    
    @Autowired
    private ServicioCrudRepository servicioCrudRepository;

    public List<Servicio>getAll(){
        return (List<Servicio>) servicioCrudRepository.findAll();
    }
    public Optional<Servicio>getServicio(int id){
        return servicioCrudRepository.findById(id);
    }

}
