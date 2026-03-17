package com.emdev.departmentstore.domain.repository;

import com.emdev.departmentstore.domain.model.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findAll();
    List<Order> findBySalesPersonId(Long salesPersonId);
    void delete(Order order);
}
