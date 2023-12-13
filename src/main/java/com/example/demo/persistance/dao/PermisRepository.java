package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.Permis;
public interface PermisRepository extends JpaRepository<Permis,Long> {
	
	//Permis findByAdress(String address);
	

    @Query(value = "select count(*) from permis",nativeQuery = true)
    int getQuantityOfPermis();
    @Query(value = "select * from permis where id= :id",nativeQuery = true)
    Permis getPermisByIdPermis(@Param("id") Long id);

}
