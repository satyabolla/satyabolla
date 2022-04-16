package com.example.demo.dto;

public class EmployeeDto {
	
 private String firstName;
 
 private String secondName;
 
 private Integer age;
 
 private Integer salary;
 
 public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Integer getSalary() {
	return salary;
}

public void setSalary(Integer salary) {
	this.salary = salary;
}

private String city;
 
 public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getSecondName() {
	return secondName;
}

public void setSecondName(String secondName) {
	this.secondName = secondName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}
 
}
