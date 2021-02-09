package com.pacewisdom.dao;

import java.util.List;
import java.util.Optional;

import com.pacewisdom.model.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(int id);
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(int id);
}
