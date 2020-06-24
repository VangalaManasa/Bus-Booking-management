package com.bus.dao;

import java.util.Date;
import java.util.List;

import com.bus.model.BusSchedule;

public interface BusScheduleDao {
	
	public List<BusSchedule> getBuses(String source, String destination, Date departureDate);
	public BusSchedule busDetails(int busScheduleId);

}
