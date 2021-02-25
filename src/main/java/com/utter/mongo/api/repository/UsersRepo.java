package com.utter.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.utter.mongo.api.model.UserObj;

public interface UsersRepo extends MongoRepository<UserObj, String> {

	
}
