package com.spring.learn.composite.relations.order.service;

import com.spring.learn.composite.relations.order.domain.Order;
import com.spring.learn.composite.relations.order.model.OrderRequestDto;
import com.spring.learn.composite.relations.order.repository.OrderRepository;
import com.spring.learn.composite.relations.orderdetail.model.OrderDetailDto;
import com.spring.learn.composite.relations.orderdetail.service.OrderDetailService;
import com.spring.learn.composite.relations.product.domain.Product;
import com.spring.learn.composite.relations.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ProductService productService;
    private final OrderDetailService orderDetailService;

    public OrderServiceImpl(OrderRepository orderRepository, ProductService productService, OrderDetailService orderDetailService) {
        this.orderRepository = orderRepository;
        this.productService = productService;
        this.orderDetailService = orderDetailService;
    }

    @Override
    public OrderDetailDto createOrderDetail(OrderRequestDto orderRequestDto, int productId) {
        Order order = createAndSaveOrder(orderRequestDto);
        Product product = productService.getProduct(productId);
        return orderDetailService.createOrderDetail(order, product);
    }

    private Order createAndSaveOrder(OrderRequestDto orderRequestDto) {
        Order order = new Order();
        order.setCustomerName(orderRequestDto.customerName());
        return orderRepository.save(order);
    }

    @Override
    public List<OrderDetailDto> getOrderDetails() {
        return orderDetailService.getOrderDetails();
    }
}
