package com.spring.learn.composite.relations.orderdetail.domain;

import com.spring.learn.composite.relations.order.domain.Order;
import com.spring.learn.composite.relations.product.domain.Product;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class OrderDetailID implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

