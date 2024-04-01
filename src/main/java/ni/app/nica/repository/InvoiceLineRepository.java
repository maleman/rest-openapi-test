package ni.app.nica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ni.app.nica.entity.InvoiceLine;

public interface InvoiceLineRepository extends JpaRepository<InvoiceLine, Long>{

}
