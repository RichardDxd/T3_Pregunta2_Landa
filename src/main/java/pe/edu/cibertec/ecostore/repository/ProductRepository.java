package pe.edu.cibertec.ecostore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ecostore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
