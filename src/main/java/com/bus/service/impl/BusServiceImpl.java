package com.bus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.BusDao;
import com.bus.model.Bus;
import com.bus.service.BusService;
@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusDao busDao;

	public List<Bus> busDetail(String busNumber) {
		return busDao.busDetail(busNumber);
	}
	

}
