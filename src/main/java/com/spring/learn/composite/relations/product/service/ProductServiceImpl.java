package com.spring.learn.composite.relations.product.service;

import com.spring.learn.composite.relations.product.domain.Product;
import com.spring.learn.composite.relations.product.repository.ProductRepository;
import com.spring.learn.composite.relations.product.model.ProductRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setName(productRequestDto.name());
        productRepository.save(product);
        return product;
    }

    @Override
    public Product getProduct(int productId) {
        return productRepository.findById(productId).orElseThrow(()->new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> getProducts() {

        return productRepository.findAll();
    }


}
