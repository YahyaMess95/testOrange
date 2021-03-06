package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Cv;
import com.example.demo.entities.Formations;
import com.example.demo.repositories.CvRepository;
import com.example.demo.services.ICvService;
import com.example.demo.repositories.CvRepository;
@Service
public class CvService implements ICvService {
	@Autowired
	CvRepository cvRepository ; 
	
	
	
	@Override
	
	public List<Cv> show()
	{
		return cvRepository.findAll() ; 
	}
	
	
	@Override

	
	public Long save(Cv Cv) 
	{
		
		cvRepository.save(Cv) ;
		return Cv.getId() ; 
		
	} 
	
	
	@Override
	
	public MessageDto update(Cv Cv , long id) 
	{
		if (cvRepository.existsById(Cv.getId() ) == true ) {
			
			Cv.setId(id);
			Cv.setFormations(cvRepository.getById(id).getFormations());
			
			
			
	     	
			
			
			
			cvRepository.save(Cv) ;
			return new MessageDto(true , "true" , "Cv Update");
			
		}
		
		
		return new MessageDto(false , "false" , "Cv does not exist");
		
	} 
	
	
	
	@Override
	
	public MessageDto delete(Long id) {
		if (cvRepository.existsById(id) == true ) 
		{
			cvRepository.deleteById(id);
			return new MessageDto(true , "true" , "Cv deleted");
			
		}
		
		return new MessageDto(false , "false" , "Cv deleted");
	}

	
	
	
}
