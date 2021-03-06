package com.example.demo.controllers;

import java.util.List;

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
import com.example.demo.entities.Entreprise;
import com.example.demo.services.IEntrepriseService;

@RestController
@CrossOrigin("*")
@RequestMapping("/entreprise")
public class EntrepriseController {

	@Autowired
	private IEntrepriseService entrepriseService ; 
	

	@GetMapping("/all")
	List<Entreprise> GetAllEntreprise() {
		
		return entrepriseService.show();
	}
	
	@PostMapping("/add")
	MessageDto ajoutEntreprise(@RequestBody Entreprise Action) {

		return entrepriseService.save(Action) ;
	}
	
	
	
	
	@GetMapping("/login/{nom}/{prenom}")
	Long GetAllEntreprise( @PathVariable  String nom ,  @PathVariable  String prenom) {
		
		return entrepriseService.login(nom, prenom);
	}
	
	
	
	
	
	
}
