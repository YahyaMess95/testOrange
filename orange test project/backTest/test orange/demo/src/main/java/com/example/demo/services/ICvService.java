package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.MessageDto;
import com.example.demo.entities.Cv;

public interface ICvService {

	MessageDto delete(Long id);

	List<Cv> show();

	Long save(Cv Cv);

	MessageDto update(Cv Cv, long id);

}
