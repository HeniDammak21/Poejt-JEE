package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.ReservationRepository;
import com.example.demo.persistance.entities.Reservation;
import com.example.demo.service.interfaces.IReservation;

@Service
public class ReservationService implements IReservation {

	@Autowired
	ReservationRepository reservationrepository;
	
	@Override
	public Reservation saveReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationrepository.save(reservation);
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationrepository.saveAndFlush(reservation);
	}

	@Override
	public boolean deleteReservation(Long id) {
		// TODO Auto-generated method stub
		 reservationrepository.deleteById(id);
		return true;
	}

	@Override
	public List<Reservation> getListReservation() {
		// TODO Auto-generated method stub
		return  reservationrepository.findAll();
	}

	@Override
	public Reservation getReservation(Long id) {
		// TODO Auto-generated method stub
		return  reservationrepository.findById(id).get();
	}

	@Override
	public int getQuantityOfReservation() {
		// TODO Auto-generated method stub
		return  reservationrepository.getQuantityOfReservation();
	}

	@Override
	public Reservation getReservationByIdReservation(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
