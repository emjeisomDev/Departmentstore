package com.emdev.departmentstore.application.dto;

import lombok.Getter;

@Getter
public class CreatePersonResponse {
    private final Long id;

    public CreatePersonResponse(Long id) {
        this.id = id;
    }
}
