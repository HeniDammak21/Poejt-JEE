package com.example.demo.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.persistance.entities.ModelVehicule;
import com.example.demo.service.interfaces.IModelVehicule;

import java.util.List;

@Controller
@RequestMapping("/api/modelvehicule")
public class ModelVehiculeController {

	@Autowired
	IModelVehicule modelvehiculeservice;


	@PostMapping(consumes = "application/x-www-form-urlencoded")
	String save(@ModelAttribute ModelVehicule modelvehicule) {
		System.out.println("*******save ***********");
		ModelVehicule savedModelVehicule = modelvehiculeservice.saveModelVehicule(modelvehicule);

		System.out.println("Saved Model Name: " + savedModelVehicule.getModelNom());
		return "redirect:/modelvehicules";
	}
	@PutMapping("/{id}")
	String updateModel(@ModelAttribute ModelVehicule modelvehicule) {
		System.out.println("*******update ***********");
		modelvehiculeservice.updateModelVehicule(modelvehicule);
		return "redirect:/modelvehicules";
	}

	@GetMapping("/{id}")
	ModelVehicule getModelVehiculeById(@PathVariable Long id) {
		return modelvehiculeservice.getModelVehiculeByIdModelVehicule(id);
	}
	@GetMapping("/quantity")
    int getQuantityPatient() {
        return modelvehiculeservice.getQuantityOfModelVehicule();
    }
	
	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable Long id) {
		modelvehiculeservice.deleteModelVehicule(id);
		return "redirect:/modelvehicules";
	}
	@GetMapping("/list")
	List<ModelVehicule> getAllModelVehicule() {
		return modelvehiculeservice.getListModelVehicule();
	}

	
	
}
