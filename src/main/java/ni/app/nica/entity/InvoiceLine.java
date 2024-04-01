package ni.app.nica.entity;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class InvoiceLine {

	private @Id @GeneratedValue Long id;

	@Column(nullable = false)
	private BigDecimal qty;

	@Column(nullable = false)
	private BigDecimal subTotal;

	@OneToMany(mappedBy = "invoiceLine")
	private Set<Product> items;
	
	@ManyToOne
    @JoinColumn(name="invoice_id", nullable=false)
    private Invoice invoice;

}
