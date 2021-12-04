package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cv;
import com.example.demo.entities.Formations;

public interface FormationsRepository extends JpaRepository<Formations, Long> {

	boolean existsByFormation(String formation) ;
	List<Formations> findByCv(Cv cv);
}
