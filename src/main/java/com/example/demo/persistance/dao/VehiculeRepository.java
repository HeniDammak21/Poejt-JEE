package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.Vehicule;
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
	
	//Vehicule findByAdress(String address);
	

    @Query(value = "select count(*) from vehicule",nativeQuery = true)
    int getQuantityOfVehicule();
    @Query(value = "select * from vehicule where id= :id",nativeQuery = true)
    Vehicule getVehiculeByIdVehicule(@Param("id") Long id);

}
