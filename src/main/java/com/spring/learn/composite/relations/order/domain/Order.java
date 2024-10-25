package com.spring.learn.composite.relations.order.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String customerName;

    public Order() {
    }

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
