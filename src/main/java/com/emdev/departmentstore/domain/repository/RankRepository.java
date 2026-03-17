package com.emdev.departmentstore.domain.repository;

import com.emdev.departmentstore.domain.model.entity.Rank;

import java.util.List;
import java.util.Optional;

public interface RankRepository {
    Rank save(Rank rank);
    Optional<Rank> findById(Long id);
    List<Rank> findAll();
    void delete(Rank rank);
}
