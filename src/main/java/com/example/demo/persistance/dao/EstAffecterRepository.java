package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.persistance.entities.EstAffecter;

public interface EstAffecterRepository extends JpaRepository<EstAffecter,Long> {
	

	

    @Query(value = "select count(*) from estaffecter",nativeQuery = true)
    int getQuantityOfEstAffecter();
    @Query(value = "select * from estaffecter where id= :id",nativeQuery = true)
    EstAffecter getEstAffecterByIdEstAffecter(@Param("id") Long id);

}