package com.spring.learn.composite.relations.orderdetail.repository;

import com.spring.learn.composite.relations.orderdetail.domain.OrderDetail;
import com.spring.learn.composite.relations.orderdetail.domain.OrderDetailID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailID> {
}
