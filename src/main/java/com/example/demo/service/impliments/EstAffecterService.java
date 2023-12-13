package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.EstAffecterRepository;
import com.example.demo.persistance.entities.EstAffecter;
import com.example.demo.service.interfaces.IEstAffecter;

@Service
public class EstAffecterService implements IEstAffecter {

	@Autowired
	EstAffecterRepository estaffecterrepository;
	
	@Override
	public EstAffecter saveEstAffecter(EstAffecter estaffecter) {
		// TODO Auto-generated method stub
		return estaffecterrepository.save(estaffecter);
	}

	@Override
	public EstAffecter updateEstAffecter(EstAffecter estaffecter) {
		// TODO Auto-generated method stub
		return estaffecterrepository.saveAndFlush(estaffecter);
	}

	@Override
	public boolean deleteEstAffecter(Long id) {
		// TODO Auto-generated method stub
		estaffecterrepository.deleteById(id);
		return true;
	}

	@Override
	public List<EstAffecter> getListEstAffecter() {
		// TODO Auto-generated method stub
		return  estaffecterrepository.findAll();
	}

	@Override
	public EstAffecter getEstAffecter(Long id) {
		// TODO Auto-generated method stub
		return  estaffecterrepository.findById(id).get();
	}

	@Override
	public int getQuantityOfEstAffecter() {
		// TODO Auto-generated method stub
		return  estaffecterrepository.getQuantityOfEstAffecter();
	}

	@Override
	public EstAffecter getEstAffecterByIdEstAffecter(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
