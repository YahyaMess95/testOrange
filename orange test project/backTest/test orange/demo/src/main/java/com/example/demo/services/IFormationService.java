package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Formations;

public interface IFormationService {

	MessageDto save(Formations formation);

	MessageDto delete(long id);

	List<Formations> show(long id);

}
