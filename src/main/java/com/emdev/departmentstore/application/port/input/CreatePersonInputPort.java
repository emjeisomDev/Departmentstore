package com.emdev.departmentstore.application.port.input;

import com.emdev.departmentstore.application.dto.CreatePersonRequest;
import com.emdev.departmentstore.application.dto.CreatePersonResponse;

public interface CreatePersonInputPort {
    CreatePersonResponse execute(CreatePersonRequest request);
}
