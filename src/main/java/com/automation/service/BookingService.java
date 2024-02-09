package com.automation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automation.entity.Booking;
import com.automation.exceptions.NullException;
@Service
public interface BookingService {

	public Booking addBooking(Booking booking);

	public Booking getBookingBybId(int bId);

	public List<Booking> getAllBookings();

	public Booking updateBooking(Booking booking) throws NullException;

	public void deleteBookingBybId(int bId);


	
}