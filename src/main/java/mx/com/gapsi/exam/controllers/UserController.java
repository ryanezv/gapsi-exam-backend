package mx.com.gapsi.exam.controllers;

import mx.com.gapsi.exam.model.UserEntity;
import mx.com.gapsi.exam.repositories.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {

    @Autowired
    UserService service;

    // Service for get data of user/candidate
    @GetMapping
    public UserEntity userData(){
        return service.get();
    }
}
