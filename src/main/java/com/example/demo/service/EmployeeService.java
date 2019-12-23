package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.emloyeeModel.EmployeeRegistration;
import com.example.demo.repositary.EmployeeRepositary;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepositary repoitary;

	public String registrationEmployee(List<EmployeeRegistration> emp) {
		repoitary.saveAll(emp);
		return "Registration completed " + emp;
	}

	public List getDetails() {
		System.out.println(">>>>>>>>>>>>>>>>");
		return repoitary.findAll();
	}

	public Boolean getemp(int id) {
		String f = "";
		System.out.println(">>>>>>>>>>>>>>>>");
		Optional<EmployeeRegistration> em = repoitary.findById(id);
		if (em != null) {
			System.out.println(">>>>>lavckja>>>>>>>>>>>");
			EmployeeRegistration e = em.get();
			System.out.println(e.getName());
			f = e.getName();
			return true;
		}
		return false;
	}

	public boolean createEmployee(EmployeeRegistration emp) {
		System.out.println("Service>>>>>>>>>");
		try {
			System.out.println("tryyyyyy>>>>>>>>>>>>>>>>");
     		repoitary.save(emp);
     		System.out.println("try excute");
			return true ;

		} catch (Exception e) {
			System.out.println("hii error occured" + e.getMessage());

		}
		return  false;
	}
	
	/*
	 * public boolean createEmployee() {
	 * System.out.println("EmployeeService createEmployee() start");
	 * EmployeeRegistration emp=new EmployeeRegistration(); try {
	 * System.out.println("try start"); // emp=new EmployeeRegistration();
	 * repo.save(emp); System.out.println("employee details saved");
	 * System.out.println(emp); System.out.println("try exucuted"); return true; }
	 * catch(Exception e) {
	 * System.out.println("we have get some exception"+e.getMessage()); } return
	 * false; }
	 */

}
