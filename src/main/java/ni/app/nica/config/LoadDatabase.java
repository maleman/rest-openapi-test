package ni.app.nica.config;

import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ni.app.nica.entity.BusinessPartner;
import ni.app.nica.entity.Product;
import ni.app.nica.repository.BusinesPartnerRepository;
import ni.app.nica.repository.ProductRepository;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(BusinesPartnerRepository businesPartnerRepository,
			ProductRepository productRepository) {
		
		var partner1 = new BusinessPartner();
		partner1.setName("TEST-1");
		partner1.setFullName("Comercializadora del Norte");
		partner1.setAddress1("Carretera panamericana Norte KM 9 1/2 Unidad de propositos");
		partner1.setTelephone("505-8888-8888");
		partner1.setIsActive(true);
		
		var partner2 = new BusinessPartner();
		partner2.setName("TEST-2");
		partner2.setFullName("Comercializadora del Sur");
		partner2.setAddress1("Carretera panamericana Sur");
		partner2.setTelephone("505-8888-8888");
		partner2.setIsActive(true);
		
		var product1 = new Product();
		product1.setCode("000-001");
		product1.setName("Servicio de desarrollo de Software Java");
		product1.setPrice(new BigDecimal("500.99"));
		product1.setDiscount(new BigDecimal("0.00"));
		
		var product2 = new Product();
		product2.setCode("000-002");
		product2.setName("Servicio de desarrollo de Software PL/SQL");
		product2.setPrice(new BigDecimal("400.99"));
		product2.setDiscount(new BigDecimal("0.00"));

		return args -> {
			log.info("Preloading " + businesPartnerRepository.save(partner1));
			log.info("Preloading " + businesPartnerRepository.save(partner2));
			log.info("Preloading " + productRepository.save(product1));
			log.info("Preloading " + productRepository.save(product2));
		};
	}
}
