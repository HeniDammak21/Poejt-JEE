package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.Client;
public interface ClientRepository extends JpaRepository<Client,Long> {
	
	Client findByNomClient(String nomClient);
	

    @Query(value = "select count(*) from client",nativeQuery = true)
    int getQuantityOfClient();
    @Query(value = "select * from client where id= :id",nativeQuery = true)
    Client getClientByIdClient(@Param("id") Long id);

}
