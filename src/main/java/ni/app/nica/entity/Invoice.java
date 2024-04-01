package ni.app.nica.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Invoice {

	private @Id @GeneratedValue Long id;

	@Column(nullable = false, length = 50)
	private String invoiceNo;

	@Column(nullable = false)
	private LocalDate dateInvoice;

	@Column(nullable = false)
	private BigDecimal subTotal;

	@Column(nullable = false)
	private BigDecimal grandTotal;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "partner_id", referencedColumnName = "id")
	private BusinessPartner partner;

	@OneToMany(mappedBy = "invoice")
	private Set<InvoiceLine> lines;
}
