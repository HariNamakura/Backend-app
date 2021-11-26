package ucundi.edu.co.application.repositories.crud;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudReposiroty extends CrudRepository<User,Integer > {
    
}
