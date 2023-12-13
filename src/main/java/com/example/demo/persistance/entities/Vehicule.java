package com.example.demo.persistance.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Vehicule implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getDateMiseEnService() {
		return dateMiseEnService;
	}
	public void setDateMiseEnService(String dateMiseEnService) {
		this.dateMiseEnService = dateMiseEnService;
	}
	public List<EstAffecter> getListaffec() {
		return Listaffec;
	}
	public ModelVehicule getModelvehicules() {
		return modelvehicules;
	}
	public void setModelvehicules(ModelVehicule modelvehicules) {
		this.modelvehicules = modelvehicules;
	}
	public void setListaffec(List<EstAffecter> listaffec) {
		Listaffec = listaffec;
	}
	
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	private String immatriculation;
    private int kilometrage;
    private String dateMiseEnService;
    @OneToMany(mappedBy = "vehicule")
    @JsonIgnore
    private List<EstAffecter> Listaffec;
    @ManyToOne
    private ModelVehicule modelvehicules;
	@OneToMany(mappedBy = "vehicule")
	@JsonIgnore
    private List<Reservation> reservations;
  
}