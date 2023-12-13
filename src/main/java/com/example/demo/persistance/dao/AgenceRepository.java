package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.Agence;
public interface AgenceRepository extends JpaRepository<Agence,Long> {
	
	//Agence findByAdress(String address);
	

    @Query(value = "select count(*) from agence",nativeQuery = true)
    int getQuantityOfAgence();
    @Query(value = "select * from agence where id= :id",nativeQuery = true)
    Agence getAgenceByIdAgence(@Param("id") Long id);

}
