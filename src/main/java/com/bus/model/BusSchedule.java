package com.bus.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BusSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busScheduleId;
	private String busNumber;
	private String source;
	private String destination;
	private Date departureDate;
	private double fare;
	private String duration;
	
	public int getBusScheduleId() {
		return busScheduleId;
	}
	public void setBusScheduleId(int busScheduleId) {
		this.busScheduleId = busScheduleId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

}
