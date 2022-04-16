package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployService {
	@Autowired
private EmployeeRepository employee;
	@Override
	public void saveEmployee(EmployeeDto dto) {
		
		Employee e= new Employee();
	    e.setFirstName(dto.getFirstName());
	    e.setSecondName(dto.getSecondName());
	    e.setCity(dto.getCity());
	    e.setAge(dto.getAge());
	    e.setSalary(dto.getSalary());
	    
	  employee.save(e);  
	    
	}
	@Override
	public List<Employee> getEmployees() {
		return  employee.findAll();
		
	}

}
