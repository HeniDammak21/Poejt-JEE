package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Reservation;
import com.example.demo.service.impliments.ClientService;
import com.example.demo.service.impliments.ReservationService;
import com.example.demo.service.impliments.VehiculeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class ReservationViewController {

    @Autowired
    private ReservationService reservationService;
    @Autowired
    private VehiculeService vehiculeService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/reservations")
    public String viewHomePage(Model model) {
        model.addAttribute("listReservation", reservationService.getListReservation());
        return "reservations";
    }
    @GetMapping("/add-reservation")
    public String showAddForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("ListeVehicules", vehiculeService.getListVehicule());
        model.addAttribute("listeClients", clientService.getListClient());
        return "add-new-reservation";
    }
    @GetMapping("/edit-reservation/{id}")
    public String showEditPatientForm(@ModelAttribute("patient") Reservation reservation, Model model) {
        model.addAttribute("reservation", reservationService.getReservation(reservation.getId()));
        //model.addAttribute("rdv", reservationService.getReservation(reservation.getId()));
        model.addAttribute("ListeVehicules", vehiculeService.getListVehicule());
        model.addAttribute("listeClients", clientService.getListClient());
        return "edit-reservation";
    }

    @GetMapping("/view-reservation/{id}")
    public String viewPatient(@ModelAttribute("consultation") Reservation reservation, Model model) {
        model.addAttribute("reservation", reservationService.getReservation(reservation.getId()));
        //model.addAttribute("consultation", reservationService.getReservation(reservation.getId()));
        model.addAttribute("ListeVehicules", vehiculeService.getListVehicule());
        model.addAttribute("listeClients", clientService.getListClient());
        return "view-reservation";
    }
   

}
