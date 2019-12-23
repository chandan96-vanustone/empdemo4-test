package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.emloyeeModel.EmployeeRegistration;

@Repository
public interface EmployeeRepositary extends JpaRepository<EmployeeRegistration, Integer> {

}
