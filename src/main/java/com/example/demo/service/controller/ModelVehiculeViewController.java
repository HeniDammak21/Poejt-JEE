package com.example.demo.service.controller;

import com.example.demo.persistance.entities.ModelVehicule;
import com.example.demo.service.impliments.ModelVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ModelVehiculeViewController {

    @Autowired
    private ModelVehiculeService modelvehiculeService;

    @GetMapping("/modelvehicules")
    public String viewHomePage(Model model) {
        model.addAttribute("listModels", modelvehiculeService.getListModelVehicule());
        return "modelvehicules";
    }
    @GetMapping("/add-model")
    public String showAdd(Model model) {
        model.addAttribute("model", new ModelVehicule());
        return "add-new-model";
    }
    @GetMapping("/edit-model/{id}")
    public String showEdit(@ModelAttribute("model") ModelVehicule modelvehicule, Model model) {
        model.addAttribute("model", modelvehiculeService.getModelVehicule(modelvehicule.getId()));
        return "edit-model";
    }

    @GetMapping("/view-model/{id}")
    public String view(@ModelAttribute("model") ModelVehicule modelvehicule, Model model) {
        model.addAttribute("model", modelvehiculeService.getModelVehicule(modelvehicule.getId()));
        return "view-model";
    }
}
