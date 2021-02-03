package com.rest.crud.service;

import java.util.List;
import java.util.Optional;

import com.rest.crud.dto.EmployeeDto;
import com.rest.crud.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(EmployeeDto employee);
	public Employee updateEmployee(EmployeeDto employee);
	public String deleteEmployee(int id);
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(int id);
}
