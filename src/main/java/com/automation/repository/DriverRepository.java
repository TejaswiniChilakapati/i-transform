package com.automation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.automation.entity.Driver;
@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {


}
