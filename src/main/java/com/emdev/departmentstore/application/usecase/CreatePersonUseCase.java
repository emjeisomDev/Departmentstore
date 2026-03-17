package com.emdev.departmentstore.application.usecase;

import com.emdev.departmentstore.application.dto.CreatePersonRequest;
import com.emdev.departmentstore.application.dto.CreatePersonResponse;
import com.emdev.departmentstore.application.port.input.CreatePersonInputPort;
import com.emdev.departmentstore.domain.model.entity.Person;
import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;
import com.emdev.departmentstore.domain.repository.PersonRepository;

import java.time.LocalDate;

public class CreatePersonUseCase implements CreatePersonInputPort {

    private final PersonRepository personRepository;
    public CreatePersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public CreatePersonResponse execute(CreatePersonRequest request){
        Person person = new Person(
                null,
                request.getName(),
                LocalDate.now(),
                new Cpf(request.getCpf()),
                request.getBirthDate(),
                request.getMothersName(),
                Gender.fromCode(request.getGender())
        );
        Person savedPerson = personRepository.save(person);
        return new  CreatePersonResponse(savedPerson.getId());
    }



}
