package ucundi.edu.co.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucundi.edu.co.application.model.Funcionario;
import ucundi.edu.co.application.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAll(){
        return funcionarioRepository.getAll();
    }

}
