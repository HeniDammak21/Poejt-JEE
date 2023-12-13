package com.example.demo.service.controller;


import com.example.demo.persistance.entities.EstAffecter;
import com.example.demo.service.impliments.VehiculeService;
import com.example.demo.service.impliments.AgenceService;
import com.example.demo.service.impliments.EstAffecterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class EstAffecterViewController {

    @Autowired
    private EstAffecterService estaffecterService;
    @Autowired
    private VehiculeService vehiculeService;
    @Autowired
    private AgenceService agenceService;

    @GetMapping("/estaffecters")
    public String viewHomePage(Model model) {
        model.addAttribute("listaffecter", estaffecterService.getListEstAffecter());
        return "estaffecters";
    }
    @GetMapping("/add-estaffecter")
    public String showAddForm(Model model) {
        model.addAttribute("estaffecter", new EstAffecter());
        model.addAttribute("ListeVehiceules", vehiculeService.getListVehicule());
        model.addAttribute("listeAgences", agenceService.getListAgence());
        return "add-new-estaffecter";
    }
    @GetMapping("/edit-estaffecter/{id}")
    public String showEditEstAffecterForm(@ModelAttribute("affectation") EstAffecter estaffecter, Model model) {
        model.addAttribute("estaffecter", estaffecterService.getEstAffecter(estaffecter.getId()));
        model.addAttribute("ListeVehiceules", vehiculeService.getListVehicule());
        model.addAttribute("listeAgences", agenceService.getListAgence());
        return "edit-estaffecter";
    }
    @GetMapping("/view-estaffecter/{id}")
    public String viewEstAffecter(@ModelAttribute("affectation") EstAffecter estaffecter, Model model) {
        model.addAttribute("estaffecter", estaffecterService.getEstAffecter(estaffecter.getId()));
        model.addAttribute("ListeVehiceules", vehiculeService.getListVehicule());
        model.addAttribute("listeAgences", agenceService.getListAgence());
        return "view-estaffecter";
    }
   

}
