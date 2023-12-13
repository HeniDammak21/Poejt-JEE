package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Agence;

public interface IAgence {

		 Agence saveAgence(Agence agence);
	     Agence updateAgence(Agence agence);
	     boolean deleteAgence(Long id);
	     List<Agence> getListAgence();
	     Agence getAgence(Long id);
	     int getQuantityOfAgence();
	     Agence getAgenceByIdAgence(Long id);
	
	
}
