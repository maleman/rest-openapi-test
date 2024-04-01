package ni.app.nica.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {

	private @Id @GeneratedValue Long id;

	@Column(nullable = false, length = 50)
	private String code;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false)
	private BigDecimal price;

	@Column(nullable = false)
	private BigDecimal discount;

	@ManyToOne
	@JoinColumn(name = "invoiceline_id")
	private InvoiceLine invoiceLine;
}
