package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Formations;
import com.example.demo.entities.Particulier;
import com.example.demo.services.IFormationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/formation")
public class FormationController {

	@Autowired
	IFormationService formationService;
	

	@GetMapping("all/{id}")
	List<Formations> show(@PathVariable Long id) 
	{

		return formationService.show(id);
	}

	@PostMapping("add")
	MessageDto AddFormation(@RequestBody Formations formation) 
	{
		return formationService.save(formation) ; 
	}
	
	@DeleteMapping("DeleteFormations")
	MessageDto DeleteFormation(@PathVariable Long id )
	{
		return formationService.delete(id);		
	}
	
	
	
}
