package ucundi.edu.co.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucundi.edu.co.application.model.Servicio;
import ucundi.edu.co.application.repositories.ServicioRepository;

@Service
public class ServicioService {
    
    @Autowired
    private ServicioRepository servicioRepository;

    public List<Servicio> getAll(){
        return servicioRepository.getAll();
    }

    public Optional<Servicio>getServicio(int id){
        return servicioRepository.getServicio(id);
    }

}
