package com.spring.learn.composite.relations.product.controller;

import com.spring.learn.composite.relations.product.domain.Product;
import com.spring.learn.composite.relations.product.model.ProductRequestDto;
import com.spring.learn.composite.relations.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    private Product createProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.createProduct(productRequestDto);
    }

    @GetMapping
    private List<Product> getAllProducts() {
        return productService.getProducts();
    }
}
