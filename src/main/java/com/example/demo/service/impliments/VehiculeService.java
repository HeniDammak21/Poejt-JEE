package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.VehiculeRepository;
import com.example.demo.persistance.entities.Vehicule;
import com.example.demo.service.interfaces.IVehicule;

@Service
public class VehiculeService implements IVehicule {

	@Autowired
	VehiculeRepository vehiculerepository;
	
	@Override
	public Vehicule saveVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		return vehiculerepository.save(vehicule);
	}

	@Override
	public Vehicule updateVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		return vehiculerepository.saveAndFlush(vehicule);
	}

	@Override
	public boolean deleteVehicule(Long id) {
		// TODO Auto-generated method stub
		 vehiculerepository.deleteById(id);
		return true;
	}

	@Override
	public List<Vehicule> getListVehicule() {
		// TODO Auto-generated method stub
		return  vehiculerepository.findAll();
	}

	@Override
	public Vehicule getVehicule(Long id) {
		// TODO Auto-generated method stub
		return  vehiculerepository.findById(id).get();
	}

	@Override
	public int getQuantityOfVehicule() {
		// TODO Auto-generated method stub
		return  vehiculerepository.getQuantityOfVehicule();
	}

	@Override
	public Vehicule getVehiculeByIdVehicule(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
