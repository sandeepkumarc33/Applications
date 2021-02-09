package com.pacewisdom.crepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacewisdom.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
