package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="Orientador")
public class Orientador extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 5221822008049978110L;
	
	/*@Id
	@GeneratedValue
	public Long id;*/

	@Column(nullable=false, length=256)
	public String ORIENTADO;
	
	@Column(nullable=false, length=256)
	public String DESCR;
	
	@Column(nullable=false, length=256)
	public String AREA;

/*	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
*/
	public String getORIENTADO() {
		return ORIENTADO;
	}

	public void setORIENTADOR(String oRIENTADO) {
		ORIENTADO = oRIENTADO;
	}

	public String getDESCR() {
		return DESCR;
	}

	public void setDESC(String dESC) {
		DESCR = dESC;
	}

	public String getAREA() {
		return AREA;
	}

	public void setAREA(String aREA) {
		AREA = aREA;
	}
	
	
	

}
