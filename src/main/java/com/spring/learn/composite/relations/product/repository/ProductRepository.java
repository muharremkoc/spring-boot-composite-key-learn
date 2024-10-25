package com.spring.learn.composite.relations.product.repository;

import com.spring.learn.composite.relations.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
