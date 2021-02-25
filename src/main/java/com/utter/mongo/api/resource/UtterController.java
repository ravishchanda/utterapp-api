package com.utter.mongo.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import com.utter.mongo.api.model.UtterObj;
import com.utter.mongo.api.repository.UtterRepo;

@RestController
public class UtterController {

	
	@Autowired
	private UtterRepo utterRepo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/addUtter")
	public String saveUtter(@RequestBody UtterObj utter) {
		utterRepo.save(utter);
		return "Added Utter with ID:"+utter.toString();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findAllUtters")
	public List<UtterObj> getUtters(){
		return utterRepo.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findAllUtters/{id}")
	public Optional<UtterObj> getUtterById(@PathVariable String id) {
		return utterRepo.findById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/delete/{id}")
	public String deleteUtter(@PathVariable String id) {
		utterRepo.deleteById(id);
		return "Deleted Utter";
	}
	
	
}
