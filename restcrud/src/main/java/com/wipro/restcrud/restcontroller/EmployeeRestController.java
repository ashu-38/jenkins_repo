package com.wipro.restcrud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restcrud.entity.Employee;
import com.wipro.restcrud.service.EmployeeServiceImp;
import com.wipro.restcrud.service.IEmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService service;
	
		@PostMapping("/add")
		public Employee   add(@RequestBody Employee employee) {
			
			Employee emp = null;
			if (EmployeeServiceImp.validateEmployee(employee)) {

				emp = service.addEmployee(employee);

			}
			
			
			return emp;
			
		}
	
		
		
		@PutMapping("/update")
		public Employee  update(@RequestBody  Employee employee) {
			Employee emp = null;
			if (EmployeeServiceImp.validateEmployee(employee)) {

				emp = service.updateEmployee(employee);

			}
			
			
			return emp;
			
			
		}
		
		@GetMapping("/get/{eid}")  
		public Employee  getById(@PathVariable int eid) {
			
			
			return service.getEmployeeById(eid);
			
		}
		
		@DeleteMapping("/delete/{eid}")
		public ResponseEntity<String>  deleteById(@PathVariable int eid){
			
			return service.deleteEmployeeById(eid);
			
		}
		
		
		
		
		
		
		@GetMapping("/getall")
		public List<Employee>  getAll(){
			
			
	
			
			return service.getAllEmployees();
			
		}
		
		
	
	

}
