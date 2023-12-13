package com.example.demo.service.controller;
import com.example.demo.persistance.entities.Vehicule;
import com.example.demo.service.impliments.ModelVehiculeService;
import com.example.demo.service.impliments.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class VehiculeViewController {
    @Autowired
    private VehiculeService vehiculeService;
    @Autowired
    private ModelVehiculeService modelService;
 
    @GetMapping("/vehicules")
    public String viewHomePage(Model model) {
        model.addAttribute("listVehicules", vehiculeService.getListVehicule());
        return "vehicules";}
    @GetMapping("/add-vehicule")
    public String showAdd(Model model) {
        model.addAttribute("vehicule", new Vehicule());
        model.addAttribute("listeModel",modelService.getListModelVehicule());
        return "add-new-vehicule";
    }
    @GetMapping("/edit-vehicule/{id}")
    public String showEdit(@ModelAttribute("vehicule") Vehicule vehicule, Model model) {
        model.addAttribute("vehicule", vehiculeService.getVehicule(vehicule.getId()));
        model.addAttribute("listeModel", modelService.getListModelVehicule());
        return "edit-vehicule";
    }
    @GetMapping("/view-vehicule/{id}")
    public String view(@ModelAttribute("vehicule") Vehicule vehicule, Model model) {
        model.addAttribute("vehicule", vehiculeService.getVehicule(vehicule.getId()));
        model.addAttribute("listeModel",modelService.getListModelVehicule());
        return "view-vehicule";
    }
}