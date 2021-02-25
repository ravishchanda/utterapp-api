package com.utter.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.utter.mongo.api.model.UtterObj;

public interface UtterRepo extends MongoRepository<UtterObj, String>{

	
	
}
