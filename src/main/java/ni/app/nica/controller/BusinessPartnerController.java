package ni.app.nica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ni.app.nica.entity.BusinessPartner;
import ni.app.nica.repository.BusinesPartnerRepository;

@RestController
public class BusinessPartnerController {

	private final BusinesPartnerRepository bpRepository;
	
	public BusinessPartnerController(BusinesPartnerRepository bpRepository) {
		this.bpRepository = bpRepository;
	}
	
	@GetMapping("/partners")
	List<BusinessPartner> all(){
		return bpRepository.findAll();
	}
	
	@GetMapping("/partners/{id}")
	BusinessPartner getPartner(@PathVariable Long id) {
		return bpRepository.findById(id).orElseThrow();
	}
	
	@PostMapping("/add-partner")
	BusinessPartner newPartner(@RequestBody BusinessPartner newPartner) {
		return bpRepository.save(newPartner);
	}
}
