package ni.app.nica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ni.app.nica.entity.Product;
import ni.app.nica.repository.ProductRepository;

@RestController
public class ProductController {

	private final ProductRepository repository;
	
	public ProductController(ProductRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/products")
	List<Product> all(){
		return repository.findAll();
	}
	
	@GetMapping("/products/{id}")
	Product getProduct(@PathVariable Long id) {
		return repository.findById(id).orElseThrow();
	}
	
	@PostMapping("/add-product")
	Product addProduct(@RequestBody Product product) {
		return repository.save(product);
	}
}
