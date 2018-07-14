package com.nelioalves.workshopmogo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmogo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
