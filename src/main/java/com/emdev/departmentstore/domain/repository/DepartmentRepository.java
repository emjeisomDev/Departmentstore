package com.emdev.departmentstore.domain.repository;

import com.emdev.departmentstore.domain.model.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository {
    Department save(Department department);
    Optional<Department> findById(Long id);
    List<Department> findAll();
    void delete(Department department);
}
