package com.emdev.departmentstore.domain.repository;

import com.emdev.departmentstore.domain.model.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    Client save(Client client);
    Optional<Client> findById(Long id);
    List<Client> findAll();
    void delete(Client client);
}
