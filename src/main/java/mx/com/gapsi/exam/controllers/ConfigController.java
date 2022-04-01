package mx.com.gapsi.exam.controllers;

import mx.com.gapsi.exam.config.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/app")
public class ConfigController {

    @Autowired
    private AppConfiguration appConfiguration;

    // Implementation for get version of application
    @GetMapping("/version")
    public String app(){
        return "Version: " + appConfiguration.getVersion();
    }
}
