package ucundi.edu.co.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucundi.edu.co.application.model.User;
import ucundi.edu.co.application.repositories.UserRepository;

@Service
public class UserService {
    
        
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

}
