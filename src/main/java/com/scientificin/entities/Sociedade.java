package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "Sociedade")
public class Sociedade extends AbstractPersistable<Long>  {

	private static final long serialVersionUID = -510946305376112674L;
	
	@Column(nullable=false, length=256)
	public String DONO;
	
	@Column(nullable=false, length=256)
	public String EMPRESA;
	
	@Column(nullable=false, length=256)
	public String DESCR;
	
	@Column(nullable=false, length=256)
	public String AREA;

	public String getDONO() {
		return DONO;
	}

	public void setDONO(String dONO) {
		DONO = dONO;
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

	public String getAREA() {
		return AREA;
	}

	public void setAREA(String aREA) {
		AREA = aREA;
	}
	
	
}
