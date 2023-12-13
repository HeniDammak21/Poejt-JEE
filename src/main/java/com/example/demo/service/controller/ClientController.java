package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.demo.persistance.entities.Client;
import com.example.demo.service.interfaces.IClient;

@Controller
@RequestMapping("/api/client")
public class ClientController {

	@Autowired
	IClient clientservice;

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    String save(@ModelAttribute Client client) {
        System.out.println("*******save ***********");
        Client savedClient = clientservice.saveClient(client);

        System.out.println("Saved Client name: " + savedClient.getNomClient());
        return "redirect:/clients";
    }
    @PutMapping("/{id}")
    String updateClient(@ModelAttribute Client Client) {
        System.out.println("*******update ***********");
        clientservice.updateClient(Client);
        return "redirect:/clients";
    }

    @GetMapping("/{id}")
    Client getClientById(@PathVariable Long id) {
        return clientservice.getClient(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityClient() {
        return clientservice.getQuantityOfClient();
    }
	
	@GetMapping("/clientByName/{name}")
	Client getPatientByName(@PathVariable String name) {
        return clientservice.findClientByName(name);
    }
	
	@DeleteMapping("/delete/{id}")
    String delete(@PathVariable Long id) {
		clientservice.deleteClient(id);
        return "redirect:/clients";
    }
    @GetMapping("/list")
    List<Client> getAllClient() {
        return clientservice.getListClient();
    }


}


