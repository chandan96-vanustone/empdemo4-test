package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.emloyeeModel.EmployeeRegistration;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empservice;

	
	  @PostMapping("/save")
	  @ResponseBody
	     public boolean getEmployee(@RequestBody  EmployeeRegistration emp) {
		  System.out.println("i>>>>>>>>>>>>>>>>");
		  	  return empservice.createEmployee(emp);
	  }
	 
	/*
	 * @PostMapping("/savemployee") public boolean createEmployee() {
	 * System.out.println("i>>>>>>>>>>>>>>>>"); return empservice.createEmployee();
	 * // return null; }
	 */
//test
	@GetMapping("/emp")
	public List getAllEmployees() {
		System.out.println(">>>>>>>>>>>>>>>>");
		return empservice.getDetails();
	}

	@GetMapping("/emp/{id}")
	public Boolean getemp(@PathVariable Integer id) {
		System.out.println(">>>>>>>>>>>>>>>>");
		return empservice.getemp(id);
	}
}
