package org.example.ordermanagementapp.repository;

import org.example.ordermanagementapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
