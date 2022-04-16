package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

public interface EmployService {
  
 public void saveEmployee(EmployeeDto dto);
 public List<Employee> getEmployees();
  
}
