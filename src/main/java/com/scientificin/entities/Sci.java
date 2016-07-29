package com.scientificin.entities;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Sci extends AbstractPersistable<Long> implements UserDetails{

	private static final long serialVersionUID = -3562775848596581645L;

	private String username;
	private String password;
	
	private boolean enabled;
	private boolean credentialsExpired;
	private boolean locked;
	private boolean accountExpired;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("IN"));
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setCredentialsExpired(boolean credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public Long getId() {
		return super.getId();
	}

}
