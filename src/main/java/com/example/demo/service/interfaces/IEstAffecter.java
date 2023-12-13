package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.EstAffecter;

public interface IEstAffecter {

		 EstAffecter saveEstAffecter(EstAffecter estaffecter);
	     EstAffecter updateEstAffecter(EstAffecter estaffecter);
	     boolean deleteEstAffecter(Long id);
	     List<EstAffecter> getListEstAffecter();
	     EstAffecter getEstAffecter(Long id);
	     int getQuantityOfEstAffecter();
	     EstAffecter getEstAffecterByIdEstAffecter(Long id);
	
	
}
