package com.nelioalves.workshopmogo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmogo.domain.User;
import com.nelioalves.workshopmogo.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repo;
	
	
		public List<User> findAll(){
			
			return repo.findAll();
		}
	
}
