package com.pacewisdom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pacewisdom.dto.EmployeeDto;
import com.pacewisdom.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(EmployeeDto employee);
	public Employee updateEmployee(EmployeeDto employee);
	public String deleteEmployee(int id);
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(int id);
}
