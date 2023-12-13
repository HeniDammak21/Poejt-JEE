package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.VilleRepository;
import com.example.demo.persistance.entities.Ville;
import com.example.demo.service.interfaces.IVille;

@Service
public class VilleService implements IVille {

	@Autowired
	VilleRepository villerepository;
	
	@Override
	public Ville saveVille(Ville Ville) {
		// TODO Auto-generated method stub
		return villerepository.save(Ville);
	}

	@Override
	public Ville updateVille(Ville Ville) {
		// TODO Auto-generated method stub
		return villerepository.saveAndFlush(Ville);
	}

	@Override
	public boolean deleteVille(Long id) {
		// TODO Auto-generated method stub
		villerepository.deleteById(id);
		return true;
	}

	@Override
	public List<Ville> getListVille() {
		// TODO Auto-generated method stub
		return  villerepository.findAll();
	}

	@Override
	public Ville getVille(Long id) {
		// TODO Auto-generated method stub
		return  villerepository.findById(id).get();
	}

	@Override
	public int getQuantityOfVille() {
		// TODO Auto-generated method stub
		return  villerepository.getQuantityOfVille();
	}

	@Override
	public Ville getVilleByIdVille(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ville findVilleByName(String name) {
		// TODO Auto-generated method stub
		return  villerepository.findByNomVille(name);
	}

}
