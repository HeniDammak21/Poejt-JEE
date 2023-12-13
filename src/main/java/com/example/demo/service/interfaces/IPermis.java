package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.Permis;

public interface IPermis {

		 Permis savePermis(Permis permis);
	     Permis updatePermis(Permis permis);
	     boolean deletePermis(Long id);
	     List<Permis> getListPermis();
	     Permis getPermis(Long id);
	     int getQuantityOfPermis();
	     Permis getPermisByIdPermis(Long id);
	
	
}
