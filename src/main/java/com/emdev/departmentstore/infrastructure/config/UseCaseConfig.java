package com.emdev.departmentstore.infrastructure.config;

import com.emdev.departmentstore.application.port.input.CreatePersonInputPort;
import com.emdev.departmentstore.application.usecase.CreatePersonUseCase;
import com.emdev.departmentstore.domain.repository.PersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreatePersonInputPort createPersonUseCase(PersonRepository personRepository) {
        return new CreatePersonUseCase(personRepository);
    }

}
