package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.ClientRepository;
import com.example.demo.persistance.entities.Client;
import com.example.demo.service.interfaces.IClient;

@Service
public class ClientService implements IClient {

	@Autowired
	ClientRepository clientrepository;
	
	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return clientrepository.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return clientrepository.saveAndFlush(client);
	}

	@Override
	public boolean deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientrepository.deleteById(id);
		return true;
	}

	@Override
	public List<Client> getListClient() {
		// TODO Auto-generated method stub
		return  clientrepository.findAll();
	}

	@Override
	public Client getClient(Long id) {
		// TODO Auto-generated method stub
		return  clientrepository.findById(id).get();
	}

	@Override
	public int getQuantityOfClient() {
		// TODO Auto-generated method stub
		return  clientrepository.getQuantityOfClient();
	}

	@Override
	public Client getClientByIdClient(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findClientByName(String name) {
		// TODO Auto-generated method stub
		return  clientrepository.findByNomClient(name);
	}

}
