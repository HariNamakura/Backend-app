package ucundi.edu.co.application.repositories.crud;

import org.springframework.data.repository.CrudRepository;

import ucundi.edu.co.application.model.User;

public interface UserCrudReposiroty extends CrudRepository<User,Integer >{
    
}
