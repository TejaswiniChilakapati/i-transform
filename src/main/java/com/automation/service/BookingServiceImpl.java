package com.automation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.automation.entity.Booking;
import com.automation.exceptions.NullException;
import com.automation.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking updateBooking(Booking booking) throws NullException{
		 Booking existingBooking= bookingRepository.findById(booking.getbId()).orElseThrow(() -> new NullException("Booking not found"));
		    existingBooking.setbId(booking.getbId());
		    existingBooking.setcId(booking.getcId());
		    existingBooking.setrId(booking.getrId());
		    existingBooking.setvId(booking.getvId());
		    existingBooking.setBookingTime(booking.getBookingTime());
		    
		    
		    
		    return bookingRepository.save(existingBooking);


		
	}

	@Override
	public void deleteBookingBybId(int bId) {
		bookingRepository.deleteById(bId);
				
	}

//	@Override
//	public Booking getBookingBybId(int bId) {
//		return bookingRepository.getById(bId);
//	}

	@Override
	public Booking getBookingBybId(int bId) {
	    return bookingRepository.findById(bId).orElse(null);
	}
	
	}
