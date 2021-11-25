package ucundi.edu.co.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucundi.edu.co.application.model.Funcionario;
import ucundi.edu.co.application.services.FuncionarioService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/Funcionario")
@CrossOrigin(origins = "*")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/all")
    public List<Funcionario> getAll() {
        return funcionarioService.getAll();
    }
    
}
