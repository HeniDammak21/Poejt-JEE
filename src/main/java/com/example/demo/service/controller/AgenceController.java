package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.demo.persistance.entities.Agence;
import com.example.demo.service.interfaces.IAgence;

@Controller
@RequestMapping("/api/agence")
public class AgenceController {

	@Autowired
	IAgence agenceservice;

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    String save(@ModelAttribute Agence agence) {
        System.out.println("*******save ***********");
        Agence savedAgence = agenceservice.saveAgence(agence);

        System.out.println("Saved Agence Address: " + savedAgence.getAddress());
        return "redirect:/agences";
    }
    @PutMapping("/{id}")
    String updateAgence(@ModelAttribute Agence agence) {
        System.out.println("*******update ***********");
         agenceservice.updateAgence(agence);
        return "redirect:/agences";
    }

    @GetMapping("/{id}")
    Agence getAgenceById(@PathVariable Long id) {
        return agenceservice.getAgence(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityAgence() {
        return agenceservice.getQuantityOfAgence();
    }
	
	
	@DeleteMapping("/delete/{id}")
    String delete(@PathVariable Long id) {
        agenceservice.deleteAgence(id);
        return "redirect:/agences";
    }
    @GetMapping("/list")
    List<Agence> getAllAgence() {
        return agenceservice.getListAgence();
    }


}


