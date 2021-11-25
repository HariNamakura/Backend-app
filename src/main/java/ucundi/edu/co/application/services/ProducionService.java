package ucundi.edu.co.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucundi.edu.co.application.model.Produccion;
import ucundi.edu.co.application.repositories.ProduccionRepository;

@Service
public class ProducionService {
    
    @Autowired
    private ProduccionRepository produccionRepository;

    public List<Produccion> getAll(){
        return produccionRepository.getAll();
    }

    public Optional<Produccion> getProduccion(int id){
        return  produccionRepository.getProduccion(id);
    }

     public Produccion save(Produccion produccion){
        
        /* if (produccion.getVehiculo().getId() == 2) {
            produccion.setTotalPrice(produccion.getServicio().getPrice()  ); */
            System.out.println("Prueba: "+ produccion.getVehiculo());
        
        
        
        if (produccion.getId() == null) {
            
            return produccionRepository.save(produccion);
        }else{
            Optional<Produccion> unaProduccion = produccionRepository.getProduccion(produccion.getId());

            if (unaProduccion.isEmpty()) {
                return produccionRepository.save(produccion);
            }else{
                return produccion;
            }
        }
    } 
}


