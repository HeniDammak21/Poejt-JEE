package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.ModelVehicule;
public interface ModelVehiculeRepository extends JpaRepository<ModelVehicule,Long> {
	
	//ModelVehicule findByNomModel(String nom);
	

    @Query(value = "select count(*) from modelvehicule",nativeQuery = true)
    int getQuantityOfModelVehicule();
    @Query(value = "select * from modelvehicule where id= :id",nativeQuery = true)
    ModelVehicule getModelVehiculeByIdModelVehicule(@Param("id") Long id);

}
