package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cv;
import com.example.demo.entities.Particulier;

public interface CvRepository extends  JpaRepository<Cv, Long> {

	List<Cv> findByParticulier(Particulier particulier);
}
