package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Vehicule;

public interface IVehicule {

		 Vehicule saveVehicule(Vehicule vehicule);
	     Vehicule updateVehicule(Vehicule vehicule);
	     boolean deleteVehicule(Long id);
	     List<Vehicule> getListVehicule();
	     Vehicule getVehicule(Long id);
	     int getQuantityOfVehicule();
	     Vehicule getVehiculeByIdVehicule(Long id);
	
	
}
