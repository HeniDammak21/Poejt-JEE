package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.Ville;
public interface VilleRepository extends JpaRepository<Ville,Long> {
	
	Ville findByNomVille(String nomVille);
	

    @Query(value = "select count(*) from ville",nativeQuery = true)
    int getQuantityOfVille();
    @Query(value = "select * from ville where id= :id",nativeQuery = true)
    Ville getVilleByIdVille(@Param("id") Long id);

}
