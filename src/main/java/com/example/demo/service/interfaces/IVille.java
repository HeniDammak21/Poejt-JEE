package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Ville;

public interface IVille {

		 Ville saveVille(Ville ville);
	     Ville updateVille(Ville ville);
	     boolean deleteVille(Long id);
	     List<Ville> getListVille();
	     Ville getVille(Long id);
	     Ville findVilleByName(String name);
	     int getQuantityOfVille();
	     Ville getVilleByIdVille(Long id);
	
	
}
