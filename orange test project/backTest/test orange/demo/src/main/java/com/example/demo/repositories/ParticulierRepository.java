package com.example.demo.repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Particulier;

public interface ParticulierRepository extends JpaRepository<Particulier, Long>{
	boolean existsByEmail(String email) ;
	boolean existsByNom(String nom) ;
	boolean existsByPrenom(String prenom) ;
	Particulier findByNomAndPrenom(String nom , String prenom) ;
	
}
