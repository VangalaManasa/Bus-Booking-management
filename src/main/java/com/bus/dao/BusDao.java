package com.bus.dao;

import java.util.List;

import com.bus.model.Bus;

public interface BusDao {
	public List<Bus> busDetail(String busNumber);

}
