package com.example.demo.service.controller;

import com.example.demo.persistance.entities.EstAffecter;
import com.example.demo.service.interfaces.IEstAffecter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/api/estaffecter")
public class EstAffecterController {

	@Autowired
	IEstAffecter estaffecterService;


	@PostMapping(consumes = "application/x-www-form-urlencoded")
	String save(@ModelAttribute EstAffecter estaffecter) {
		System.out.println("*******save ***********");
		EstAffecter savedEstAffecter = estaffecterService.saveEstAffecter(estaffecter);
		System.out.println("Saved Est Affecter ID: " + savedEstAffecter.getId());
		return "redirect:/estaffecters";
	}
	@PutMapping("/{id}")
	String updateEstAffecter(@ModelAttribute EstAffecter estaffecter) {
		System.out.println("*******update ***********");
		estaffecterService.updateEstAffecter(estaffecter);
		return "redirect:/estaffecters";
	}

	@GetMapping("/{id}")
	EstAffecter getEstAffecterById(@PathVariable Long id) {
		return estaffecterService.getEstAffecterByIdEstAffecter(id);
	}

	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable Long id) {
		estaffecterService.deleteEstAffecter(id);
		return "redirect:/estaffecters";
	}
	@GetMapping("/list")
	List<EstAffecter> getAllEstAffecter() {
		return estaffecterService.getListEstAffecter();
	}



}
