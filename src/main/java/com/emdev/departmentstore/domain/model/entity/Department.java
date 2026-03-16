package com.emdev.departmentstore.domain.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import lombok.Getter;

@Getter
public class Department {
    private final Long id;
    private final String name;
    private final String acronym;
    private final BigDecimal annualBudget;
    private final String email;

    private Long managerId;

    private boolean deleted;
    private LocalDateTime deletedAt;

    public Department(
            Long id,
            String name,
            String acronym,
            BigDecimal annualBudget,
            String email
    ) {
        validateName(name);
        validateBudget(annualBudget);

        this.id = id;
        this.name = name;
        this.acronym = acronym;
        this.annualBudget = annualBudget;
        this.email = email;
        this.deleted = false;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }
    }

    private void validateBudget(BigDecimal budget) {
        if (budget == null || budget.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Department budget must be positive");
        }
    }

    public void assignManager(Long managerId) {
        this.managerId = managerId;
    }

    public void markAsDeleted() {
        this.deleted = true;
        this.deletedAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
