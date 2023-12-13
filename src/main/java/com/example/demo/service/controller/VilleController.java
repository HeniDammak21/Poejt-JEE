package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Ville;

import com.example.demo.service.interfaces.IVille;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/api/ville")
public class VilleController {


	@Autowired
	IVille villeService;

	@PostMapping(consumes = "application/x-www-form-urlencoded")
	String save(@ModelAttribute Ville ville) {
		System.out.println("*******save ***********");
		Ville savedVille = villeService.saveVille(ville);

		System.out.println("Saved Ville Nom: " + savedVille.getNomVille());
		return "redirect:/villes";
	}
	@PutMapping("/{id}")
	String update(@ModelAttribute Ville ville) {
		System.out.println("*******update ***********");
		villeService.updateVille(ville);
		return "redirect:/villes";
	}

	@GetMapping("/{id}")
	Ville getById(@PathVariable Long id) {
		return villeService.getVille(id);
	}


	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable Long id) {
		villeService.deleteVille(id);
		return "redirect:/villes";
	}
	@GetMapping("/list")
	List<Ville> getAllVille() {
		return villeService.getListVille();
	}

}
