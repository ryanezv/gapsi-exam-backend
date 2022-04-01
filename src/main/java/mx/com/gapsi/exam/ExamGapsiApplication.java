package mx.com.gapsi.exam;

import mx.com.gapsi.exam.model.SupplierEntity;
import mx.com.gapsi.exam.model.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class ExamGapsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamGapsiApplication.class, args);
	}

	// Implementation for expose IDs of entities
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer()
	{
		return RepositoryRestConfigurer.withConfig(config -> {
			config.exposeIdsFor(SupplierEntity.class);
		});
	}
}
