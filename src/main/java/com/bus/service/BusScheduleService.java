package com.bus.service;

import java.util.Date;
import java.util.List;

import com.bus.model.BusSchedule;

public interface BusScheduleService {
	public List<BusSchedule> getBuses(String source, String destination, Date departureDate);
	public BusSchedule busDetail(int busScheduleId);

}
