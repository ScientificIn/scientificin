package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "Estagiario")
public class Estagiario extends AbstractPersistable<Long>  {
	

	@Column(nullable=false, length=256)
	public String EMPRESA;
	
	@Column(nullable=false, length=256)
	public String DESCR;
	
	@Column(nullable=false, length=256)
	public String AREA;

	public String getEMPRESA() {
		return EMPRESA;
	}

	public void setEMPRESA(String eMPRESA) {
		EMPRESA = eMPRESA;
	}

	public String getAREA() {
		return AREA;
	}

	public void setAREA(String aREA) {
		AREA = aREA;
	}

	public String getDESCR() {
		return DESCR;
	}

	public void setDESCR(String dESCR) {
		DESCR = dESCR;
	}
	
	
	

}
