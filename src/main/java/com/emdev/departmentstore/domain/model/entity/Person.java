package com.emdev.departmentstore.domain.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    private final Long id;
    private final String name;
    private final LocalDate registrationDate;
    private final String cpf;
    private final LocalDate birthDate;
    private final String mothersName;
    private final char gender;

    private boolean deleted;
    private LocalDateTime deletedAt;

    public Person(
            Long id,
            String name,
            LocalDate registrationDate,
            String cpf,
            LocalDate birthDate,
            String mothersName,
            char gender)
    {
        validateName(name);
        validateCpf(cpf);

        this.id = id;
        this.name = name;
        this.registrationDate = registrationDate;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.mothersName = mothersName;
        this.gender = gender;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Person name cannot be empty");
        }
    }

    private void validateCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF cannot be empty");
        }
    }

    public void markAsDeleted() {
        this.deleted = true;
        this.deletedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getMothersName() {
        return mothersName;
    }

    public char getGender() {
        return gender;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
