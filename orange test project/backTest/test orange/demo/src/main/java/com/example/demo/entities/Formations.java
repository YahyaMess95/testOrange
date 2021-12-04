package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Formations {

	@Id
	@GeneratedValue
	private Long id ; 
	private String formation ; 
	
	 @ManyToOne
	 @JoinColumn(name = "cv_id", nullable = false)
	 private Cv cv ;
	
}
