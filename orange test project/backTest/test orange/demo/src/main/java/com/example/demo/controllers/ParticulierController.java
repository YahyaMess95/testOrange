package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Particulier;
import com.example.demo.services.IParticulierService;

@RestController
@CrossOrigin("*")
@RequestMapping("/particulier")
public class ParticulierController {

	@Autowired
	IParticulierService particulierService ; 
	

	@GetMapping("all")
	List<Particulier> GetAllParticulier() {
		
		return particulierService.show();
	}
	
	@PostMapping("add")
	MessageDto ajoutParticulier(@RequestBody Particulier Action) {

		return particulierService.save(Action) ;
	}
	

	
	
	
	@GetMapping("/login/{nom}/{prenom}")
	Long Login( @PathVariable  String nom ,  @PathVariable  String prenom) {
		
		return particulierService.login(nom, prenom);
	}
	
	@GetMapping("/findbyid/{id}")
	Optional<Particulier> findbyId (@PathVariable Long id){
		
		
		return particulierService.findbyId(id) ; 
		
	}
	
	
	
}
