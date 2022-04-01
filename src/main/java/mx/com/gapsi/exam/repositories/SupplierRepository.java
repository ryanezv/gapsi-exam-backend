package mx.com.gapsi.exam.repositories;

import mx.com.gapsi.exam.model.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:8080")
public interface SupplierRepository extends JpaRepository<SupplierEntity, String> {
}
