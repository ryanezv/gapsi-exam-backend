package mx.com.gapsi.exam.controllers;

import mx.com.gapsi.exam.model.SupplierEntity;
import mx.com.gapsi.exam.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "/api")
public class SupplierController {

    @Autowired
    private SupplierRepository repository;

    @RequestMapping(path = "/supplier", method = RequestMethod.POST)
    public SupplierEntity save(@RequestBody SupplierEntity entity){

        //validate entity and name attribute of entity
        if(entity == null || entity.getName().trim() == "")
            return entity;

        // Get all suppliers of database
        List<SupplierEntity> suppliers = repository.findAll();

        // Search by suppliers duplicate, only save if not exist
        suppliers.stream()
                .filter(supplier -> supplier.getName().equalsIgnoreCase(entity.getName().trim()))
                .findAny()
                .orElse(repository.save(entity));

        return entity;
    }
}
