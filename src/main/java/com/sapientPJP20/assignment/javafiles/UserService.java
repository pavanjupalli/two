package com.sapientPJP20.assignment.javafiles;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	

	public UserRepository userRepository;
	
	
	
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}




	public  boolean name(String username, String password) {
		Optional<Credentials> cre =  userRepository.findByUsername(username);
		if(cre.isPresent())
		{
			if(cre.get().getPassword().equals(password))
			return true;
			else 
				return false;
		}else {
			return false;
		}
	}

}
