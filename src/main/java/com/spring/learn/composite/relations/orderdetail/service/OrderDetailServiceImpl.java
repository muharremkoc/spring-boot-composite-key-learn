package com.spring.learn.composite.relations.orderdetail.service;

import com.spring.learn.composite.relations.order.domain.Order;
import com.spring.learn.composite.relations.orderdetail.domain.OrderDetail;
import com.spring.learn.composite.relations.orderdetail.domain.OrderDetailID;
import com.spring.learn.composite.relations.orderdetail.model.OrderDetailDto;
import com.spring.learn.composite.relations.orderdetail.repository.OrderDetailRepository;
import com.spring.learn.composite.relations.product.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public OrderDetailDto createOrderDetail(Order order, Product product) {
        OrderDetailID orderDetailID = new OrderDetailID();
        orderDetailID.setOrder(order);
        orderDetailID.setProduct(product);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(orderDetailID);
        orderDetail.setCreatedAt(new Date());
        orderDetailRepository.save(orderDetail);
        return mapToOrderDetailDto(orderDetail);
    }

    @Override
    public List<OrderDetailDto> getOrderDetails() {
        List<OrderDetail> orderDetailsList = orderDetailRepository.findAll();
        List<OrderDetailDto> orderDetailDtoList = new ArrayList<>();
        orderDetailsList.forEach(orderDetail -> orderDetailDtoList.add(mapToOrderDetailDto(orderDetail)));
        return orderDetailDtoList;
    }

    private OrderDetailDto mapToOrderDetailDto(OrderDetail orderDetail) {
        return new OrderDetailDto(
                orderDetail.getId().getOrder().getOrderId(),
                orderDetail.getId().getOrder().getCustomerName(),
                orderDetail.getId().getProduct().getName(),
                orderDetail.getCreatedAt());
    }
}