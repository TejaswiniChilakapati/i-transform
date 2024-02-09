package com.automation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automation.entity.Driver;
import com.automation.exceptions.NullException;
@Service
public interface DriverService {

	public Driver addDriver(Driver driver);

	public Driver getDriverBydId(int dId);

	public List<Driver> getAllDrivers();

	public Driver updateDriver(Driver driver)throws NullException;

	public void deleteDriverBydId(int dId);

}

