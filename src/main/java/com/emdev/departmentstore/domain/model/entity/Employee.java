package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Employee extends Person {
    private final Integer registrationNumber;
    private Long departmentId;

    public Employee(
            Long id,
            String name,
            LocalDate registrationDate,
            Cpf cpf,
            LocalDate birthDate,
            String mothersName,
            Gender gender,
            Integer registrationNumber,
            Long departmentId
    ) {
        super(id, name, registrationDate, cpf, birthDate, mothersName, gender);
        this.registrationNumber = registrationNumber;
        this.departmentId = departmentId;
    }

    private void validateRegistrationNumber(Integer registrationNumber) {
        if (registrationNumber == null || registrationNumber <= 0) {
            throw new IllegalArgumentException("Registration number must be positive");
        }
    }

    public void changeDepartment(Long departmentId) {
        if (departmentId == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        this.departmentId = departmentId;
    }


}
