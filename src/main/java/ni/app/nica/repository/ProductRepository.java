package ni.app.nica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ni.app.nica.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
