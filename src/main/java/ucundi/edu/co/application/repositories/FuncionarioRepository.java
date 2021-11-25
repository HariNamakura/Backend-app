package ucundi.edu.co.application.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ucundi.edu.co.application.model.Funcionario;
import ucundi.edu.co.application.repositories.crud.FuncionarioCrudRepository;

@Repository
public class FuncionarioRepository {
    
    @Autowired
    private FuncionarioCrudRepository funcionarioCrudRepository;

    public List<Funcionario> getAll(){
            return (List<Funcionario>) funcionarioCrudRepository.findAll();
    }

}
