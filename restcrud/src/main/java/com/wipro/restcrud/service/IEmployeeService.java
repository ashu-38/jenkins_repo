package com.wipro.restcrud.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wipro.restcrud.entity.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee);

	public  Employee updateEmployee(Employee employee);
	
	public Employee   getEmployeeById(int eid);
	
	public   ResponseEntity<String>     deleteEmployeeById(int eid);
	
	
	public List<Employee> getAllEmployees();

}
