package com.bus.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.BusScheduleDao;
import com.bus.model.BusSchedule;
import com.bus.service.BusScheduleService;
@Service
public class BusScheduleServiceImpl implements BusScheduleService {
	@Autowired
	BusScheduleDao busScheduleDao;

	public List<BusSchedule> getBuses(String source, String destination, Date departureDate) {
		return busScheduleDao.getBuses(source, destination, departureDate);
	}

	public BusSchedule busDetail(int busScheduleId) {
		return busScheduleDao.busDetails(busScheduleId);
	}

}
