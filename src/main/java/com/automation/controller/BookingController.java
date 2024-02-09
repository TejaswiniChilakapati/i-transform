package com.automation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automation.entity.Booking;
import com.automation.exceptions.NullException;
import com.automation.repository.BookingRepository;
import com.automation.repository.BookingRepository;
import com.automation.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private BookingService bookingService;

	@PostMapping("/add")
	// localhost:8080/booking/add
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}

	// localhost:8080/booking/get
	@GetMapping("/get")
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}

	// localhost:8080/booking/put/{id}
	@PutMapping("/put/{bId}")
	public Booking updateBooking(@PathVariable int bId, @RequestBody Booking booking) throws NullException {

		booking.setbId(bId);

		return bookingService.updateBooking(booking);

	}

	// localhost:8080/booking/delete/{id}
	@DeleteMapping("/delete/{bId}")

	public void deleteBooking(@PathVariable int bId) {
		bookingService.deleteBookingBybId(bId);
	}

	@GetMapping("/getbyid/{bId}")
	public Booking getBookingById(@PathVariable int bId) {
	    Booking booking = bookingService.getBookingBybId(bId);
	    return (booking != null) ? booking : new Booking(); // Return an empty Booking object if not found
	}
}
