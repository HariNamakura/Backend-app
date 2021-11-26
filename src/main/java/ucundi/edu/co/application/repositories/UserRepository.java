package ucundi.edu.co.application.repositories;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import ucundi.edu.co.application.repositories.crud.UserCrudReposiroty;

public class UserRepository {
    
    @Autowired
    private UserCrudReposiroty userCrudReposiroty;

    public List<User> getAll(){
            return (List<User>) userCrudReposiroty.findAll();
    }
}
