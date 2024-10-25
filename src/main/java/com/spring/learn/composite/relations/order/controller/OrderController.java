package com.spring.learn.composite.relations.order.controller;

import com.spring.learn.composite.relations.order.model.OrderRequestDto;
import com.spring.learn.composite.relations.order.service.OrderService;
import com.spring.learn.composite.relations.orderdetail.model.OrderDetailDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderDetailService) {
        this.orderService = orderDetailService;
    }

    @PostMapping
    public OrderDetailDto createOrderDetail(@RequestBody OrderRequestDto orderRequestDto, @RequestParam int productId) {
        return orderService.createOrderDetail(orderRequestDto,productId);
    }

    @GetMapping
    public List<OrderDetailDto> getOrderDetails() {
        return orderService.getOrderDetails();
    }
}
