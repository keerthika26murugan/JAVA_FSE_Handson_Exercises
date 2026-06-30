package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.employee.projection.EmployeeProjection;

import com.employee.entity.Employee;

public interface EmployeeRepository
extends JpaRepository<Employee,Long>{

Employee findByName(String name);

List<EmployeeProjection> findBy();

}

