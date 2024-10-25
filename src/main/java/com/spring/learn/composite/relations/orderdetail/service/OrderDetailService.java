package com.spring.learn.composite.relations.orderdetail.service;

import com.spring.learn.composite.relations.order.domain.Order;
import com.spring.learn.composite.relations.orderdetail.model.OrderDetailDto;
import com.spring.learn.composite.relations.product.domain.Product;

import java.util.List;

public interface OrderDetailService {
    OrderDetailDto createOrderDetail(Order order, Product product);
    List<OrderDetailDto> getOrderDetails();
}
