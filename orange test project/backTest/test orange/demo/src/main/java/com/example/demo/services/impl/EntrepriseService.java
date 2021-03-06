package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Entreprise;
import com.example.demo.repositories.EntrepriseRepository;
import com.example.demo.services.IEntrepriseService;
@Service
public class EntrepriseService implements IEntrepriseService {

	@Autowired
	private EntrepriseRepository entrepriseRepository ; 
	
	
	@Override
	
	public List<Entreprise> show()
	{
		return entrepriseRepository.findAll() ; 
	}
	
	
	@Override
	
	public MessageDto save(Entreprise entreprise) 
	{
		if (entrepriseRepository.existsByRegistreCommerce(entreprise.getRegistreCommerce() )) {
			
			return new MessageDto(false , "false" , "register exist");
			
		}
		
		entrepriseRepository.save(entreprise) ;
		return new MessageDto(true , "true" , "added succefuly");
		
		
	} 
	
	

	
	
	
	@Override
	public MessageDto delete(Long id) {
		if (entrepriseRepository.existsById(id) == true ) 
		{
			entrepriseRepository.deleteById(id);
			return new MessageDto(true , "true" , "entreprise deleted");
			
		}
		
		return new MessageDto(false , "false" , "entreprise deleted");
	}

	
	
	@Override
	public Long login(String nom , String prenom)
	{
		if (entrepriseRepository.existsByNom(nom) == true && entrepriseRepository.existsByPrenom(prenom)==true ) {
			return entrepriseRepository.findByNomAndPrenom(nom, prenom).getId() ; 
		}
		return null ; 
	}
		
	
	
	
	
}
