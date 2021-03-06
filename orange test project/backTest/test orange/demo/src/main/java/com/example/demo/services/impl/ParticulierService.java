package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Particulier;
import com.example.demo.repositories.ParticulierRepository;
import com.example.demo.services.IParticulierService;
import com.example.demo.repositories.ParticulierRepository;
@Service
public class ParticulierService  implements IParticulierService{

	
	@Autowired
	ParticulierRepository particulierRepository ; 
	
	
	@Override

	public List<Particulier> show()
	{
	return	particulierRepository.findAll() ; 
	}
	
	
	
	@Override
	public MessageDto save(Particulier Particulier) 
	{
		if (particulierRepository.existsByEmail(Particulier.getEmail() ) == true ) {
			
			return new MessageDto(true , "error" , "email exist");
			
		}
		
		particulierRepository.save(Particulier) ;
		return new MessageDto(true , "success" , "added succefuly");
		
		
	} 
	

	
	@Override
	public MessageDto delete(Long id) {
		if (particulierRepository.existsById(id) == true ) 
		{
			particulierRepository.deleteById(id);
			return new MessageDto(true , "true" , "Particulier deleted");
			
		}
		
		return new MessageDto(false , "false" , "Particulier deleted");
	}

	

	@Override
	public Long login(String nom , String prenom)
	{
		if (particulierRepository.existsByNom(nom) == true && particulierRepository.existsByPrenom(prenom)==true ) {
			return particulierRepository.findByNomAndPrenom(nom, prenom).getId() ; 
		}
		return null ; 
	}
		

	@Override
	public Optional<Particulier> findbyId(Long id) {
		
		return particulierRepository.findById(id); 
		
	}
	
	
	
	
}
