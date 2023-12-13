package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Client;
import com.example.demo.service.impliments.ClientService;
import com.example.demo.service.impliments.PermisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class ClientViewController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private PermisService permiService;

    @GetMapping("/clients")
    public String viewHomePage(Model model) {
        model.addAttribute("listclient", clientService.getListClient());
        return "clients";
    }
    @GetMapping("/add-client")
    public String showAddForm(Model model) {
        model.addAttribute("client", new Client());
        model.addAttribute("listepemris", permiService.getListPermis());
        return "add-new-client";
    }
    @GetMapping("/edit-client/{id}")
    public String showEditPatientForm(@ModelAttribute("Client") Client client, Model model) {
        model.addAttribute("client", clientService.getClient(client.getId()));
        model.addAttribute("listepemris", permiService.getListPermis());
        return "edit-client";
    }

    @GetMapping("/view-client/{id}")
    public String viewPatient(@ModelAttribute("Client") Client client, Model model) {
        model.addAttribute("client", clientService.getClient(client.getId()));
        model.addAttribute("listepemris", permiService.getListPermis());
        return "view-client";
    }


}
