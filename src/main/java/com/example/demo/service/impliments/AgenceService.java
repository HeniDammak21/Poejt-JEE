package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.AgenceRepository;
import com.example.demo.persistance.entities.Agence;
import com.example.demo.service.interfaces.IAgence;

@Service
public class AgenceService implements IAgence {

	@Autowired
	AgenceRepository agencerepository;
	
	@Override
	public Agence saveAgence(Agence Agence) {
		// TODO Auto-generated method stub
		return agencerepository.save(Agence);
	}

	@Override
	public Agence updateAgence(Agence Agence) {
		// TODO Auto-generated method stub
		return agencerepository.saveAndFlush(Agence);
	}

	@Override
	public boolean deleteAgence(Long id) {
		// TODO Auto-generated method stub
		 agencerepository.deleteById(id);
		return true;
	}

	@Override
	public List<Agence> getListAgence() {
		// TODO Auto-generated method stub
		return  agencerepository.findAll();
	}

	@Override
	public Agence getAgence(Long id) {
		// TODO Auto-generated method stub
		return  agencerepository.findById(id).get();
	}

	@Override
	public int getQuantityOfAgence() {
		// TODO Auto-generated method stub
		return  agencerepository.getQuantityOfAgence();
	}

	@Override
	public Agence getAgenceByIdAgence(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
