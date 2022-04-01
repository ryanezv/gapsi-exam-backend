package mx.com.gapsi.exam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.com.gapsi.exam.model.SupplierEntity;
import mx.com.gapsi.exam.repositories.SupplierRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Class for loading data to H2 Database from /resources/bd.json
@Configuration
public class LoadDatabaseH2 {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabaseH2.class);

    @Bean
    public CommandLineRunner initDatabase(SupplierRepository repository) {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<SupplierEntity>> mapType = new TypeReference<List<SupplierEntity>>() {};
            InputStream is = TypeReference.class.getResourceAsStream("/bd.json");
            try {
                List<SupplierEntity> stateList = mapper.readValue(is, mapType);
                repository.saveAll(stateList);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
