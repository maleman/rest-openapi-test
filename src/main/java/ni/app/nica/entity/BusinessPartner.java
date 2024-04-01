package ni.app.nica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class BusinessPartner {

	 private @Id @GeneratedValue Long id;
	 
	 @Column( nullable = false, length=50 )
	 private String name;
	 
	 @Column( nullable = false, length=50 )
	 private String fullName;
	 
	 @Column( nullable = false, length=5000 )
	 private String address1;
	 
	 @Column(length=5000 )
	 private String address2;
	 
	 @Column( nullable = false, length=20 )
	 private String telephone;
	 
	 private Boolean isActive;
}
