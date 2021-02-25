package com.utter.mongo.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utter.mongo.api.model.UserObj;
import com.utter.mongo.api.repository.UsersRepo;

@RestController
public class UsersController {

	@Autowired
	UsersRepo userRepo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/addUser")
	public String addNewUser(@RequestBody UserObj user) {
		return userRepo.save(user).toString();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/updateUser")
	public String updateUser(@RequestBody UserObj userObj) {
 		return userRepo.save(userObj).toString();
		//TODO learn this to return updated user details back
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getAllUsers")
	public List<UserObj> getAllUsers() {
		return userRepo.findAll();
	}
	
	
	
	
	
}
