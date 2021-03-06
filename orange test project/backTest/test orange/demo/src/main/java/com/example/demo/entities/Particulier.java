package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Particulier {

	@Id
	@GeneratedValue
	private Long id ; 
	@Column(unique=true)
	private String email ; 
	private String nom ; 
	private String prenom ; 
	private String dateNaissance ; 
	private long numeroTelephone ; 
	private String adress ; 
	private String ville ; 
	private String pays ; 
	private String niveauEtude ; 
	private String profil ; 
	
	@OneToOne(mappedBy = "particulier")
	@JsonIgnore
	private Cv cv ;
	
	
	
}
