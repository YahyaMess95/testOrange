package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cv {
	
	@Id
	@GeneratedValue
	private Long id ;
	

	
    @OneToMany(mappedBy = "cv")
    @JsonIgnore
	private List<Formations> formations ;
    
	@OneToOne
	
    private Particulier particulier ; 

	
}
