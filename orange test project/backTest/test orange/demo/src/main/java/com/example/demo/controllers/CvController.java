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
import com.example.demo.entities.Cv;
import com.example.demo.services.ICvService;

@RestController
@CrossOrigin("*")
@RequestMapping("/Cv")
public class CvController {
	@Autowired
	ICvService cvService ; 
	

	@GetMapping("getCv")
	List<Cv> GetAllCv() {
		
		return cvService.show();
	}
	
	@PostMapping("add")
	Long ajoutCv(@RequestBody Cv Action) {

		 return cvService.save(Action) ;
		 
	}
	
	
	
	@PutMapping("UpdateCv/{id}")
	MessageDto updateCv(@RequestBody Cv Action, @PathVariable  Long id) {

		
	return cvService.update(Action, id) ;
	
	}
	
	
	
	@DeleteMapping("DeleteCv/{id}")
	MessageDto deleteCv(@PathVariable  Long id) {

		
	return cvService.delete (id) ;
	
	}

	
	
	
	
}
