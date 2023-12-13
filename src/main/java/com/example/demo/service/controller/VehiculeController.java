package com.example.demo.service.controller;
import com.example.demo.persistance.entities.Vehicule;
import com.example.demo.service.interfaces.IVehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/vehicule")
public class VehiculeController {
	@Autowired
    IVehicule vehiculeservice;
    @PostMapping(consumes = "application/x-www-form-urlencoded")
    String save(@ModelAttribute Vehicule vehicule) {
        System.out.println("*******save ***********");
        Vehicule savedVehicule = vehiculeservice.saveVehicule(vehicule);

        System.out.println("Saved Vehicule Immatricule: " + savedVehicule.getImmatriculation());
        return "redirect:/vehicules";
    }
    @PutMapping("/{id}")
    String updateVehicule(@ModelAttribute Vehicule vehicule) {
        System.out.println("*******update ***********");
        vehiculeservice.updateVehicule(vehicule);
        return "redirect:/vehicules";
    }

    @GetMapping("/{id}")
    Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeservice.getVehicule(id);
    }
	
	
	@DeleteMapping("/delete/{id}")
    String delete(@PathVariable Long id) {
		vehiculeservice.deleteVehicule(id);
        return "redirect:/vehicules";
    }
    @GetMapping("/list")
    List<Vehicule> getAllVehicule() {
        return vehiculeservice.getListVehicule();
    }
}


