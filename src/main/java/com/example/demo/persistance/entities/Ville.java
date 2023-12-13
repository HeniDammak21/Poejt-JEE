package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ville implements Serializable {

	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getCodePostal() {
			return codePostal;
		}

		public void setCodePostal(int codePostal) {
			this.codePostal = codePostal;
		}

		public String getNomVille() {
			return nomVille;
		}

		public void setNomVille(String nomVille) {
			this.nomVille = nomVille;
		}

		public List<Agence> getAgences() {
			return agences;
		}

		public void setAgences(List<Agence> agences) {
			this.agences = agences;
		}

		private int codePostal;
	    private String nomVille;
	
		@OneToMany(fetch = FetchType.LAZY,mappedBy = "villes")
		@JsonIgnore
	    private List<Agence> agences;

	

}
