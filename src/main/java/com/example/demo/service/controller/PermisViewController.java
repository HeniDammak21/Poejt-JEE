package com.example.demo.service.controller;
import com.example.demo.persistance.entities.Permis;
import com.example.demo.service.impliments.PermisService;
import com.example.demo.service.impliments.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PermisViewController {

    @Autowired
    private PermisService permisService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/permis")
    public String viewHomePage(Model model) {
        model.addAttribute("listPermis", permisService.getListPermis());
        return "permis";
    }
    @GetMapping("/add-permis")
    public String showAddForm(Model model) {
        model.addAttribute("permis", new Permis());
        model.addAttribute("listeClient", clientService.getListClient());
        return "add-new-permis";
    }
    @GetMapping("/edit-permis/{id}")
    public String showEditPermisForm(@ModelAttribute("permis") Permis permis, Model model) {
        model.addAttribute("permis", permisService.getPermis(permis.getId()));
        model.addAttribute("listeClient", clientService.getListClient());
        return "edit-permis";
    }

    @GetMapping("/view-permis/{id}")
    public String viewPatient(@ModelAttribute("permis") Permis permis, Model model) {
        model.addAttribute("permis", permisService.getPermis(permis.getId()));
        model.addAttribute("listeClient", clientService.getListClient());
        return "view-permis";
    }


}