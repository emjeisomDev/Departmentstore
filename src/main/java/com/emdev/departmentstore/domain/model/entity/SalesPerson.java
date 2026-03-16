package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class SalesPerson extends Employee {
    private Integer overtimeHoursQuant;
    private BigDecimal overtimeHoursPaid;

    public SalesPerson(
            Long id,
            String name,
            LocalDate registrationDate,
            Cpf cpf,
            LocalDate birthDate,
            String mothersName,
            Gender gender,
            Integer registrationNumber,
            Long departmentId,
            Integer overtimeHoursQuant,
            BigDecimal overtimeHoursPaid) {
        super(id, name, registrationDate, cpf, birthDate, mothersName, gender, registrationNumber, departmentId);
        this.overtimeHoursQuant = overtimeHoursQuant;
        this.overtimeHoursPaid = overtimeHoursPaid;
    }

    public void addOvertimeHours(int hours, BigDecimal payment) {

        if (hours <= 0) {
            throw new IllegalArgumentException("Overtime hours must be positive");
        }

        if (payment == null || payment.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Overtime payment must be positive");
        }

        this.overtimeHoursQuant += hours;
        this.overtimeHoursPaid = this.overtimeHoursPaid.add(payment);
    }

}
