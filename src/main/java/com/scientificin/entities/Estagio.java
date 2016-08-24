package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "Estagio")
public class Estagio extends AbstractPersistable<Long>  {
	private static final long serialVersionUID = 9089184430103318666L;
	
	
/*	@Column(nullable=false, length=256)
	public Long id2;*/

	@Column(nullable=false, length=256)
	public String EMPRESA;
	
	@Column(nullable=false, length=256)
	public String DESCR;
	
	@Column(nullable=false, length=256)
	public String area;
	
/*	public Long getId() {
		return id2;
	}

	public void setId(Long id) {
		this.id2 = id;
	}*/
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEMPRESA() {
		return EMPRESA;
	}

	public void setEMPRESA(String eMPRESA) {
		EMPRESA = eMPRESA;
	}

	public String getDESCR() {
		return DESCR;
	}

	public void setDESC(String dESCR) {
		DESCR = dESCR;
	}
	

}
