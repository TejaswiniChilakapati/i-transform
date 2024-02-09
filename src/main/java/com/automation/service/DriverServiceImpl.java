package com.automation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.automation.entity.Booking;
import com.automation.entity.Driver;
import com.automation.exceptions.NullException;
import com.automation.repository.DriverRepository;
@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;

	@Override
	public Driver addDriver(Driver driver) {
	return driverRepository.save(driver);
	}

	@Override
	public Driver getDriverBydId(int dId) {
	    return driverRepository.findById(dId).orElse(null);
	}


	@Override
	public List<Driver> getAllDrivers() {
		return driverRepository.findAll();
	}

	@Override
	public Driver updateDriver(Driver driver) throws NullException {
	    Driver existingDriver= driverRepository.findById(driver.getdId()).orElseThrow(() -> new NullException("Driver not found"));
	    existingDriver.setName(driver.getName());
	    existingDriver.setdId(driver.getdId());
	    existingDriver.setContNo(driver.getContNo());
	    
	    return driverRepository.save(existingDriver);

		
	}

	@Override
	public void deleteDriverBydId(int dId) {
		driverRepository.deleteById(dId);
	}
	
	
	}


