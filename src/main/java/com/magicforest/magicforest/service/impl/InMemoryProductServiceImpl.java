package com.magicforest.magicforest.service.impl;

import com.magicforest.magicforest.model.entity.products.Product;
import com.magicforest.magicforest.repository.InMemoryProductDAO;
import com.magicforest.magicforest.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryProductServiceImpl implements ProductService {

    private final InMemoryProductDAO repository;
    @Override
    public List<Product> findAllProducts() {
        return repository.findAllProducts();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(repository.findById(id));
    }

    @Override
    public Product findByProductCode(Long productCode) {
        return repository.findByProductCode(productCode);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.updateProduct(product);
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.saveProduct(product);
    }

    @Override
    public void deleteProduct(Long productCode) {
        repository.deleteProduct(productCode);
    }
}
