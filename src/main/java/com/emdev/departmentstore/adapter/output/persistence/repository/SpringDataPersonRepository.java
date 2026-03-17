package com.emdev.departmentstore.adapter.output.persistence.repository;

import com.emdev.departmentstore.adapter.output.persistence.entity.PersonJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataPersonRepository extends JpaRepository<PersonJpaEntity, Long> {
    Optional<PersonJpaEntity> findByCpf(String cpf);
}
