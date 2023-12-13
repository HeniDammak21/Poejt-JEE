package com.example.demo.service.impliments;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.persistance.dao.ModelVehiculeRepository;
import com.example.demo.persistance.entities.ModelVehicule;
import com.example.demo.service.interfaces.IModelVehicule;

@Service
public class ModelVehiculeService implements IModelVehicule {

	@Autowired
	ModelVehiculeRepository modelvehiculerepository;
	
	@Override
	public ModelVehicule saveModelVehicule(ModelVehicule modelvehicule) {
		// TODO Auto-generated method stub
		return modelvehiculerepository.save(modelvehicule);
	}

	@Override
	public ModelVehicule updateModelVehicule(ModelVehicule modelvehicule) {
		// TODO Auto-generated method stub
		return modelvehiculerepository.saveAndFlush(modelvehicule);
	}

	@Override
	public boolean deleteModelVehicule(Long id) {
		// TODO Auto-generated method stub
		modelvehiculerepository.deleteById(id);
		return true;
	}

	@Override
	public List<ModelVehicule> getListModelVehicule() {
		// TODO Auto-generated method stub
		return  modelvehiculerepository.findAll();
	}

	@Override
	public ModelVehicule getModelVehicule(Long id) {
		// TODO Auto-generated method stub
		return  modelvehiculerepository.findById(id).get();
	}

	@Override
	public int getQuantityOfModelVehicule() {
		// TODO Auto-generated method stub
		return  modelvehiculerepository.getQuantityOfModelVehicule();
	}

	@Override
	public ModelVehicule getModelVehiculeByIdModelVehicule(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
