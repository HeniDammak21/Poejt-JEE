package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Permis;

import com.example.demo.service.interfaces.IPermis;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/api/permis")
public class PermisController {


	@Autowired
	IPermis permisService;

	@PostMapping(consumes = "application/x-www-form-urlencoded")
	String save(@ModelAttribute Permis permis) {
		System.out.println("*******save ***********");
		Permis savedPermis = permisService.savePermis(permis);

		System.out.println("Saved Permis Date: " + savedPermis.getDateObtention());
		return "redirect:/permis";
	}
	@PutMapping("/{id}")
	String update(@ModelAttribute Permis permis) {
		System.out.println("*******update ***********");
		permisService.updatePermis(permis);
		return "redirect:/permis";
	}

	@GetMapping("/{id}")
	Permis getById(@PathVariable Long id) {
		return permisService.getPermis(id);
	}


	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable Long id) {
		permisService.deletePermis(id);
		return "redirect:/permis	";
	}
	@GetMapping("/list")
	List<Permis> getAllPermis() {
		return permisService.getListPermis();
	}

}
