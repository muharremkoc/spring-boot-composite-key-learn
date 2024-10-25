package com.spring.learn.composite.relations.orderdetail.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "order_details")
public class OrderDetail extends DateAudit {

    @EmbeddedId
    private OrderDetailID id;


    public OrderDetail() {
    }

    public OrderDetailID getId() {
        return id;
    }

    public void setId(OrderDetailID id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
