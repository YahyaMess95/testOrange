package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Entreprise;

public interface IEntrepriseService {

	MessageDto save(Entreprise entreprise);

	MessageDto delete(Long id);



	Long login(String nom, String prenom);

	List<Entreprise> show();

}
