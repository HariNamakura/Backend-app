package ucundi.edu.co.application.repositories;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ucundi.edu.co.application.model.User;
import ucundi.edu.co.application.repositories.crud.UserCrudReposiroty;

@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudReposiroty userCrudReposiroty;

    public List<User> getAll(){
            return (List<User>) userCrudReposiroty.findAll();
    }
}
