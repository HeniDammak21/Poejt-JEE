package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.PermisRepository;
import com.example.demo.persistance.entities.Permis;
import com.example.demo.service.interfaces.IPermis;

@Service
public class PermisService implements IPermis {

	@Autowired
	PermisRepository permisrepository;
	
	@Override
	public Permis savePermis(Permis permis) {
		// TODO Auto-generated method stub
		return permisrepository.save(permis);
	}

	@Override
	public Permis updatePermis(Permis permis) {
		// TODO Auto-generated method stub
		return permisrepository.saveAndFlush(permis);
	}

	@Override
	public boolean deletePermis(Long id) {
		// TODO Auto-generated method stub
		permisrepository.deleteById(id);
		return true;
	}

	@Override
	public List<Permis> getListPermis() {
		// TODO Auto-generated method stub
		return  permisrepository.findAll();
	}

	@Override
	public Permis getPermis(Long id) {
		// TODO Auto-generated method stub
		return  permisrepository.findById(id).get();
	}

	@Override
	public int getQuantityOfPermis() {
		// TODO Auto-generated method stub
		return  permisrepository.getQuantityOfPermis();
	}

	@Override
	public Permis getPermisByIdPermis(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
