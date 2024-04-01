package ni.app.nica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ni.app.nica.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
