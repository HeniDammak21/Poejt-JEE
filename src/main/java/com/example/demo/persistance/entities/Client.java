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
public class Client implements Serializable {

	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNomClient() {
			return nomClient;
		}
		public void setNomClient(String nomClient) {
			this.nomClient = nomClient;
		}
		public String getPrenomClient() {
			return prenomClient;
		}
		public void setPrenomClient(String prenomClient) {
			this.prenomClient = prenomClient;
		}
		public List<Reservation> getReservations() {
			return reservations;
		}
		public void setReservations(List<Reservation> reservations) {
			this.reservations = reservations;
		}
		public Permis getPermis() {
			return permis;
		}
		public void setPermis(Permis permis) {
			this.permis = permis;
		}
		private String nomClient;
	    private String prenomClient;
	
		@OneToMany(fetch = FetchType.LAZY,mappedBy = "clients")
		@JsonIgnore
	    private List<Reservation> reservations;
		@OneToOne
	    private Permis permis;

	

}
