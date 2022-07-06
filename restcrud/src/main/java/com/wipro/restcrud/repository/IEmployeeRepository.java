package com.wipro.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restcrud.entity.Employee;
@Repository
public interface IEmployeeRepository  extends JpaRepository<Employee,Integer> {

}
