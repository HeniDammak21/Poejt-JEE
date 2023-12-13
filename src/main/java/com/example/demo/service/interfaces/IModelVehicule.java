package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.ModelVehicule;

public interface IModelVehicule {

		 ModelVehicule saveModelVehicule(ModelVehicule modelvehicule);
	     ModelVehicule updateModelVehicule(ModelVehicule modelvehicule);
	     boolean deleteModelVehicule(Long id);
	     List<ModelVehicule> getListModelVehicule();
	     ModelVehicule getModelVehicule(Long id);
	     //ModelVehicule findModelVehiculeByName(String name);
	     int getQuantityOfModelVehicule();
	     ModelVehicule getModelVehiculeByIdModelVehicule(Long id);
	
	
}
