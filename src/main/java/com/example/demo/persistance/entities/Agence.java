package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agence implements Serializable{

	@Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<EstAffecter> getAffecList() {
		return affecList;
	}
	public void setAffecList(List<EstAffecter> affecList) {
		this.affecList = affecList;
	}
	public Ville getVilles() {
		return villes;
	}
	public void setVilles(Ville villes) {
		this.villes = villes;
	}
	private String telephone;
	  private String address;
	
	@JsonIgnore
	  @OneToMany(mappedBy="agence",fetch=FetchType.LAZY)
	  private List<EstAffecter>affecList;
	@ManyToOne
    private Ville villes;

}
