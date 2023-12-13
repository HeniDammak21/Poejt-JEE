package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.persistance.entities.Reservation;
import com.example.demo.service.interfaces.IReservation;
@Controller
@RequestMapping("/api/reservation")
public class ReservationController {

	@Autowired
	IReservation reservationservice;

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    String save(@ModelAttribute Reservation reservation) {
        System.out.println("*******save ***********");
        Reservation savedReservation = reservationservice.saveReservation(reservation);

        System.out.println("Saved Reservation ID: " + savedReservation.getId());
        return "redirect:/reservations";
    }
    @PutMapping("/{id}")
    String updateReservation(@ModelAttribute Reservation reservation) {
        System.out.println("*******update ***********");
        reservationservice.updateReservation(reservation);
        return "redirect:/reservations";
    }

    @GetMapping("/{id}")
    Reservation getReservationById(@PathVariable Long id) {
        return reservationservice.getReservation(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityReservation() {
        return reservationservice.getQuantityOfReservation();
    }
	
	@DeleteMapping("/delete/{id}")
    String delete(@PathVariable Long id) {
		reservationservice.deleteReservation(id);
        return "redirect:/reservations";
    }
    @GetMapping("/list")
    List<Reservation> getAllReservation() {
        return reservationservice.getListReservation();
    }


}


