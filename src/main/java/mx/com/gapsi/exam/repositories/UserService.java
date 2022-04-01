package mx.com.gapsi.exam.repositories;

import mx.com.gapsi.exam.model.UserEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@Scope("singleton")
@CrossOrigin(origins = "http://localhost:8080")
public class UserService {

    // Initialization data of user, it can change
    public UserEntity get(){
        return new UserEntity("Ricardo", "Yanez", "Viviano");
    }
}
