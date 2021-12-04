package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Particulier;

public interface IParticulierService {

	MessageDto save(Particulier Particulier);

	MessageDto delete(Long id);

	Long login(String nom, String prenom);

	List<Particulier> show();

	Optional<Particulier> findbyId(Long id);


}
