package com.emdev.departmentstore.adapter.output.persistence;

import com.emdev.departmentstore.adapter.output.persistence.entity.PersonJpaEntity;
import com.emdev.departmentstore.adapter.output.persistence.repository.SpringDataPersonRepository;
import com.emdev.departmentstore.domain.model.entity.Person;
import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;
import com.emdev.departmentstore.domain.repository.PersonRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private final SpringDataPersonRepository repository;

    public PersonRepositoryImpl(SpringDataPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person save(Person person) {
        PersonJpaEntity entity = toEntity(person);
        PersonJpaEntity saved = repository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<Person> findById(Long id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public Optional<Person> findByCpf(Cpf cpf) {
        return repository.findByCpf(cpf.getValue()).map(this::toDomain);
    }

    @Override
    public List<Person> findAll() {
        return List.of();
    }

    @Override
    public void delete(Person person) {

    }


    // ========= MAPPERS =========

    private PersonJpaEntity toEntity(Person person){
        return new  PersonJpaEntity(
                person.getId(),
                person.getName(),
                person.getRegistrationDate(),
                person.getCpf().getValue(),
                person.getBirthDate(),
                person.getMothersName(),
                person.getGender().getCode(),
                person.isDeleted(),
                person.getDeletedAt()
        );
    }
    private Person toDomain(PersonJpaEntity entity){
        return new  Person(
                entity.getId(),
                entity.getName(),
                entity.getRegistrationDate(),
                new Cpf(entity.getCpf()),
                entity.getBirthDate(),
                entity.getMothersName(),
                Gender.fromCode(entity.getGender())
        );
    }


}
