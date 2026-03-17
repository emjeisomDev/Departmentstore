package com.emdev.departmentstore.adapter.input.rest;

import com.emdev.departmentstore.application.dto.CreatePersonRequest;
import com.emdev.departmentstore.application.dto.CreatePersonResponse;
import com.emdev.departmentstore.application.port.input.CreatePersonInputPort;
import com.emdev.departmentstore.domain.model.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persons")
public class PersonController {
    private final CreatePersonInputPort createPersonUseCase;
    public PersonController(CreatePersonInputPort createPersonUseCase) {
        this.createPersonUseCase = createPersonUseCase;
    }

    @PostMapping
    public ResponseEntity<CreatePersonResponse> createPerson(
            @RequestBody CreatePersonRequest request)
    {
        CreatePersonResponse response = createPersonUseCase.execute(request);
        return ResponseEntity.ok(response);
    }


}
