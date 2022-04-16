package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeResource {
@Autowired
private EmployService service;
@PostMapping
public void saveemployee(@RequestBody EmployeeDto dto) {
service.saveEmployee(dto);	
 
}
@GetMapping
public List<Employee> getEmployees() {
	return service.getEmployees();
} 
} 

