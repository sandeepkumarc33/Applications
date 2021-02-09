package com.pacewisdom.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.pacewisdom.crepository.EmployeeRepository;
import com.pacewisdom.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		 employeeRepository.deleteById(id);
		 return "success";
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int Id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(Id);
	}

}
