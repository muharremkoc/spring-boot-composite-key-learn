package com.spring.learn.composite.relations.product.service;

import com.spring.learn.composite.relations.product.domain.Product;
import com.spring.learn.composite.relations.product.model.ProductRequestDto;

import java.util.List;

public interface ProductService {

    Product createProduct(ProductRequestDto productRequestDto);

    Product getProduct(int productId);

    List<Product> getProducts();


}
