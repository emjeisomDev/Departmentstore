package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Manager extends Employee {

    public Manager(Long id,
                   String name,
                   LocalDate registrationDate,
                   Cpf cpf,
                   LocalDate birthDate,
                   String mothersName,
                   Gender gender,
                   Integer registrationNumber,
                   Long departmentId) {
        super(id,
                name,
                registrationDate,
                cpf,
                birthDate,
                mothersName,
                gender,
                registrationNumber,
                departmentId
        );
    }
}
