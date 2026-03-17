package com.emdev.departmentstore.domain.repository;

import com.emdev.departmentstore.domain.model.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
    void delete(Employee employee);
}
