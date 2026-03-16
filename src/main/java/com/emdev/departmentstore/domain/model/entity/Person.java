package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
public class Person {
    private final Long id;
    private final String name;
    private final LocalDate registrationDate;
    private final Cpf cpf;
    private final LocalDate birthDate;
    private final String mothersName;
    private final Gender gender;

    private boolean deleted;
    private LocalDateTime deletedAt;

    public Person(
            Long id,
            String name,
            LocalDate registrationDate,
            Cpf cpf,
            LocalDate birthDate,
            String mothersName,
            Gender gender)
    {
        validateName(name);

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

    public void markAsDeleted() {
        this.deleted = true;
        this.deletedAt = LocalDateTime.now();
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
