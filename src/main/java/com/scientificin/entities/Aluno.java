package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "Aluno")
public class Aluno extends AbstractPersistable<Long>  {

	private static final long serialVersionUID = 5432762686427691351L;
	
	@Column(nullable=false, length=256)
	public String ORIENTANDO;
	
	@Column(nullable=false, length=256)
	public String UNIVERSIDADE;
	
	@Column(nullable=false, length=256)
	public String DESCR;
	
	@Column(nullable=false, length=256)
	public String AREA;

	public String getORIENTANDO() {
		return ORIENTANDO;
	}

	public void setORIENTANDO(String oRIENTANDO) {
		ORIENTANDO = oRIENTANDO;
	}

	public String getUNIVERSIDADE() {
		return UNIVERSIDADE;
	}

	public void setUNIVERSIDADE(String uNIVERSIDADE) {
		UNIVERSIDADE = uNIVERSIDADE;
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
