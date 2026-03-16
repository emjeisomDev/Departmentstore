package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.Cpf;
import com.emdev.departmentstore.domain.model.valueobject.Gender;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class Client extends Person {

    private Long rankId;

    public Client(
            Long id,
            String name,
            LocalDate registrationDate,
            Cpf cpf,
            LocalDate birthDate,
            String mothersName,
            Gender gender,
            Long rankId
    ) {
        super(id, name, registrationDate, cpf, birthDate, mothersName, gender);

        this.rankId = rankId;
    }

    public void changeRank(Long rankId) {
        if (rankId == null) {
            throw new IllegalArgumentException("Rank cannot be null");
        }

        this.rankId = rankId;
    }

}
