package ucundi.edu.co.application.services;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import ucundi.edu.co.application.repositories.UserRepository;

public class UserService {
    
        
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

}
