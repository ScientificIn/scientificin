package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="sociedade")
public class Sociedade extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -510946305376112674L;

	@Column(nullable = false, length = 256)
	public String dono;

	@Column(nullable = false, length = 256)
	public String empresa;

	@Column(nullable = false, length = 256)
	public String descricao;

	@Column(nullable = false, length = 256)
	public String area;

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
