package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
	boolean existsByRegistreCommerce(String registreCommerce) ;
	boolean existsByNom(String nom) ;
	boolean existsByPrenom(String prenom) ;
	Entreprise findByNomAndPrenom(String nom , String prenom) ;
}
