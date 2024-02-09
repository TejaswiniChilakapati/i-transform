package com.automation.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookingDetails")
public class Booking {
    @Id
    @GeneratedValue
	private int bId;
	private int cId;
	private int vId;
	private int rId;
	LocalDateTime bookingTime;

	public Booking() {
		super();
		
	}

	public Booking(int bId, int cId, int vId, int rId, LocalDateTime bookingTime) {
		super();
		this.bId = bId;
		this.cId = cId;
		this.vId = vId;
		this.rId = rId;
		this.bookingTime = bookingTime;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	@Override
	public String toString() {
		return "Booking [bId=" + bId + ", cId=" + cId + ", vId=" + vId + ", rId=" + rId + ", bookingTime=" + bookingTime
				+ "]";
	}

}

