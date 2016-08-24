package com.scientificin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.Sci;

public interface SciRepository extends JpaRepository<Sci, Long>{

	Sci findByUsername(String username);

	Sci findByUsernameAndPassword(String username, String password);

}
