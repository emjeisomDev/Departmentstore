package com.emdev.departmentstore.domain.repository;

import com.emdev.departmentstore.domain.model.entity.Person;
import com.emdev.departmentstore.domain.model.valueobject.Cpf;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Person save(Person person);
    Optional<Person> findById(Long id);
    Optional<Person> findByCpf(Cpf cpf);
    List<Person> findAll();
    void delete(Person person);
}
