package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Engineer extends Employee {

    private BigDecimal stipend;
    private String specialty;

    public Engineer(Long id,
                    String name,
                    LocalDate registrationDate,
                    Cpf cpf,
                    LocalDate birthDate,
                    String mothersName,
                    Gender gender,
                    Integer registrationNumber,
                    Long departmentId,
                    BigDecimal stipend,
                    String specialty) {
        super(id,
                name,
                registrationDate,
                cpf,
                birthDate,
                mothersName,
                gender,
                registrationNumber,
                departmentId);
        this.stipend = stipend;
        this.specialty = specialty;
    }
}
