package com.example.demo.service.controller;
import com.example.demo.persistance.entities.Agence;
import com.example.demo.service.impliments.AgenceService;
import com.example.demo.service.impliments.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class AgenceViewController {
    @Autowired
    private AgenceService agenceService;
    @Autowired
    private VilleService villeService;
    @GetMapping("/agences")
    public String viewHomePage(Model model) {
        model.addAttribute("listAgences", agenceService.getListAgence());
        return "agences";}
    @GetMapping("/add-agence")
    public String showAdd(Model model) {
        model.addAttribute("Agence", new Agence());
        model.addAttribute("listeville",villeService.getListVille());
        return "add-new-agence";
    }
    @GetMapping("/edit-agence/{id}")
    public String showEdit(@ModelAttribute("agence") Agence agence, Model model) {
        model.addAttribute("Agence", agenceService.getAgence(agence.getId()));
        model.addAttribute("listeville", villeService.getListVille());
        return "edit-agence";
    }
    @GetMapping("/view-agence/{id}")
    public String view(@ModelAttribute("agence") Agence agence, Model model) {
        model.addAttribute("Agence", agenceService.getAgence(agence.getId()));
        model.addAttribute("listeville",villeService.getListVille());
        return "view-agence";
    }
}