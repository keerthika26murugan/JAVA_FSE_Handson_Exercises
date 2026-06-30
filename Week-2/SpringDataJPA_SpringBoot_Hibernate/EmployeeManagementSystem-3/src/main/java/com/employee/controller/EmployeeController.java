package com.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Employee save(
            @RequestBody Employee emp) {

        return repo.save(emp);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        repo.deleteById(id);
    }
}
