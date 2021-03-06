package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MessageDto;

import com.example.demo.entities.Formations;
import com.example.demo.repositories.FormationsRepository;
import com.example.demo.services.IFormationService;
@Service
public class FormationService implements IFormationService {

	@Autowired
	FormationsRepository formationRepository;
	
	@Override
	public MessageDto save(Formations formation) {
		if (formationRepository.existsByFormation(formation.getFormation())) {

			return new MessageDto(true, "false", "formation exist");

		}

		formationRepository.save(formation);
		return new MessageDto(true, "true", "added succefuly");

	}


	@Override
	public MessageDto delete(long id) {
		if (formationRepository.existsById(id)) {

			formationRepository.deleteById(id);
			return new MessageDto(true, "true", "deleted succefuly");
		}

		return new MessageDto(true, "false", "formation does not exist");
	}


	@Override
	public List<Formations> show(long id) {

		List<Formations> formation = new ArrayList<Formations>();

		for (int i = 0; i < formationRepository.findAll().size(); i++) {
			if (formationRepository.findAll().get(i).getCv().getParticulier().getId() == id) {
				formation.add(formationRepository.findAll().get(i));
			}

		}

		return formation;

	}
	
	

	
	
	
	

}
