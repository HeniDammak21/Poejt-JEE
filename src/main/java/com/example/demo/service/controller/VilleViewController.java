package com.example.demo.service.controller;
import com.example.demo.persistance.entities.Ville;
import com.example.demo.service.impliments.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class VilleViewController {

    @Autowired
    private VilleService villeService;


    @GetMapping("/villes")
    public String viewHomePage(Model model) {
        model.addAttribute("listVille", villeService.getListVille());
        return "villes";
    }
    @GetMapping("/add-ville")
    public String showAddForm(Model model) {
        model.addAttribute("Ville", new Ville());
        //model.addAttribute("listeClient", clientService.getListClient());
        return "add-new-ville";
    }
    @GetMapping("/edit-ville/{id}")
    public String showEditVilleForm(@ModelAttribute("Ville") Ville ville, Model model) {
        model.addAttribute("Ville", villeService.getVille(ville.getId()));
        //model.addAttribute("listeClient", clientService.getListClient());
        return "edit-ville";
    }

    @GetMapping("/view-ville/{id}")
    public String viewVille(@ModelAttribute("Ville") Ville ville, Model model) {
        model.addAttribute("Ville", villeService.getVille(ville.getId()));
        //model.addAttribute("listeClient", clientService.getListClient());
        return "view-ville";
    }


}