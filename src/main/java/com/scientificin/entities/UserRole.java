package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "user_roles")
public class UserRole extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -2645580252603801891L;
	
	@Email
	@JoinColumn(name = "username", referencedColumnName = "username", table = "sci", nullable = false, unique = true)
	private String username;
	@Column(length = 64, nullable = false)
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
