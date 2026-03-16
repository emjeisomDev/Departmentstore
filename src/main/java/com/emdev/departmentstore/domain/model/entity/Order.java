package com.emdev.departmentstore.domain.model.entity;

import com.emdev.departmentstore.domain.model.valueobject.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import lombok.Getter;

@Getter
public class Order {
    private final Long id;
    private final Long salesPersonId;
    private final LocalDate orderDate;

    private OrderStatus status;

    private boolean deleted;
    private LocalDateTime deletedAt;

    public Order(
            Long id,
            Long salesPersonId,
            LocalDate orderDate,
            OrderStatus status
    ) {
        validateSalesPerson(salesPersonId);
        validateDate(orderDate);

        this.id = id;
        this.salesPersonId = salesPersonId;
        this.orderDate = orderDate;
        this.status = status;
        this.deleted = false;
    }

    private void validateSalesPerson(Long salesPersonId) {
        if (salesPersonId == null) {
            throw new IllegalArgumentException("SalesPerson cannot be null");
        }
    }

    private void validateDate(LocalDate orderDate) {
        if (orderDate == null) {
            throw new IllegalArgumentException("Order date cannot be null");
        }
    }

    public void changeStatus(OrderStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Order status cannot be null");
        }

        this.status = status;
    }

    public void markAsDeleted() {
        this.deleted = true;
        this.deletedAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
