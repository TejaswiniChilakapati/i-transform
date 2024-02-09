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

import com.automation.entity.Driver;
import com.automation.exceptions.NullException;
import com.automation.repository.DriverRepository;
import com.automation.repository.DriverRepository;
import com.automation.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {
    
	@Autowired
    private DriverRepository driverRepository;
    @Autowired 
    private DriverService driverService;
    //localhost:8080/driver/add
    @PostMapping("/add")
    public Driver addDriver(@RequestBody Driver driver) {
        return driverService.addDriver(driver);
    }
    //localhost:8080/driver/getbyid/{id}
    @GetMapping("/getbyid/{dId}")
    	public Driver getDriverBydId(@PathVariable int dId) {
    	    Driver driver = driverService.getDriverBydId(dId);
    	    return (driver != null) ? driver : new Driver(); // Return an empty Booking object if not found
    	}
    //localhost:8080/driver/all
    @GetMapping("/all")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }
    //localhost:8080/driver/update/{id}
    @PutMapping("/update/{dId}")
    public Driver                                                                                                                                                                                                                                                                                                 updateDriver(@PathVariable int dId, @RequestBody Driver driver) throws NullException {
    	
    	        driver.setdId(dId);
               return driverService.updateDriver(driver);
    }
    //localhost:8080/driver/delete/{id}
    @DeleteMapping("/delete/{dId}")
    public void deleteDriver(@PathVariable int dId) {
        driverService.deleteDriverBydId(dId);
    }
}


	
	
	
	

