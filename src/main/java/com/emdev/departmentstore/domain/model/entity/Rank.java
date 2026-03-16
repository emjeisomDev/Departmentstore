package com.emdev.departmentstore.domain.model.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import lombok.Getter;

@Getter
public class Rank {
    private final Long id;
    private final String name;

    private boolean deleted;
    private LocalDateTime deletedAt;

    public Rank(Long id, String name, boolean deleted) {
        validateName(name);
        this.id = id;
        this.name = name;
        this.deleted = deleted;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Rank name cannot be empty");
        }
    }

    public void markAsDeleted() {
        this.deleted = true;
        this.deletedAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rank rank = (Rank) o;
        return Objects.equals(id, rank.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
