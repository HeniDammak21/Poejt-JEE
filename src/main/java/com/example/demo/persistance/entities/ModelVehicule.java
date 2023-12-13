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
public class ModelVehicule implements Serializable {

	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getModelNom() {
			return modelNom;
		}

		public void setModelNom(String modelNom) {
			this.modelNom = modelNom;
		}

		public String getMarque() {
			return marque;
		}

		public void setMarque(String marque) {
			this.marque = marque;
		}

		public int getPrixJourne() {
			return prixJourne;
		}

		public void setPrixJourne(int prixJourne) {
			this.prixJourne = prixJourne;
		}

		public List<Vehicule> getVehicules() {
			return vehicules;
		}

		public void setVehicules(List<Vehicule> vehicules) {
			this.vehicules = vehicules;
		}

		private String modelNom;
	    private String marque;
	    private int prixJourne;
	
		@OneToMany(mappedBy = "modelvehicules",fetch = FetchType.LAZY)
		@JsonIgnore
	    private List<Vehicule> vehicules;

	

}
