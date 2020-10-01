package com.sapientPJP20.assignment.javafiles;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Credentials, Long>{
	
	public Optional<Credentials> findByUsername(String username);

}
