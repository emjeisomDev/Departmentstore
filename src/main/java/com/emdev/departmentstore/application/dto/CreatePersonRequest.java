package com.emdev.departmentstore.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CreatePersonRequest {
    private final String name;
    private final String cpf;
    private final LocalDate birthDate;
    private final String mothersName;
    private final String gender;

    public CreatePersonRequest(
            String name,
            String cpf,
            LocalDate birthDate,
            String mothersName,
            String gender
    ) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.mothersName = mothersName;
        this.gender = gender;
    }


}
