package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entreprise {

	@Id
	@GeneratedValue
	private Long id ; 
	@Column(unique=true)
	private String registreCommerce ; 
	private String nomEntreprise ; 
	private String nom ; 
	private String prenom ; 
	private long numeroTelephone ; 
	private long deuxiemeNumeroTelephone ; 
	private String mail ; 
	private String adress; 
	private String ville ; 
	private String pays ;
	
	
	
	
}
