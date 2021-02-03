package com.rest.crud.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.dto.EmployeeDto;
import com.rest.crud.model.Employee;
import com.rest.crud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static final Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired(required = true)
	private EmployeeService employeeService;

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody EmployeeDto employee) {
		try {
			return employeeService.saveEmployee(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		return null;
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody EmployeeDto employee) {

		try {
			return employeeService.updateEmployee(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		return null;
	}

	@DeleteMapping("/deleteEmployee/{Id}")
	public String deleteEmployee(@PathVariable int Id) {

		try {
			return employeeService.deleteEmployee(Id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		return null;
	}

	@RequestMapping(path = "/getAllEmployees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		try {
			return employeeService.getAllEmployees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		return null;
	}

	@GetMapping("/getEmployeeById/{Id}")
	public Optional<Employee> getEmployeeById(@PathVariable int Id) {
		try {
			return employeeService.getEmployeeById(Id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		return null;
	}

}
