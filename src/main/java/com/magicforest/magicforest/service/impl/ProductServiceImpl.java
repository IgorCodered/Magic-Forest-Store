package com.magicforest.magicforest.service.impl;

import com.magicforest.magicforest.model.entity.products.Product;
import com.magicforest.magicforest.repository.ProductRepository;
import com.magicforest.magicforest.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    @Override
    public List<Product> findAllProducts() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Product findByProductCode(Long productCode) {
        return repository.findByProductCode(productCode);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProduct(Long productCode) {
        repository.deleteByProductCode(productCode);
    }
}
