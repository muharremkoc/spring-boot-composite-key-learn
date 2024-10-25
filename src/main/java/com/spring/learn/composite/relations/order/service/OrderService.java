package com.spring.learn.composite.relations.order.service;

import com.spring.learn.composite.relations.order.domain.Order;
import com.spring.learn.composite.relations.order.model.OrderRequestDto;
import com.spring.learn.composite.relations.orderdetail.model.OrderDetailDto;

import java.util.List;

public interface OrderService {

    OrderDetailDto createOrderDetail(OrderRequestDto orderRequestDto, int productId);

    List<OrderDetailDto> getOrderDetails();

}
