package com.spring.learn.composite.relations.order.repository;

import com.spring.learn.composite.relations.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
