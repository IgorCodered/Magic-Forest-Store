package com.magicforest.magicforest.service;

import com.magicforest.magicforest.model.entity.products.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    List<Product> findAllProducts();
    Optional<Product> findById(Long id);
    Product findByProductCode(Long productCode);
    Product updateProduct(Product product);
    Product saveProduct(Product product);
    void deleteProduct(Long productCode);
}
