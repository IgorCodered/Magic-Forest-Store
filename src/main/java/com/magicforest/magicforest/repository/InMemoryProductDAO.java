package com.magicforest.magicforest.repository;

import com.magicforest.magicforest.model.entity.products.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryProductDAO {
    private final List<Product> PRODUCTS = new ArrayList<>();

    public List<Product> findAllProducts() {
        return PRODUCTS;
    }

    public Product findById(Long id) {
        return PRODUCTS.stream()
                .filter(element -> element.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Product findByProductCode(Long productCode) {
        return PRODUCTS.stream()
                .filter(element -> element.getProductCode().equals(productCode))
                .findFirst()
                .orElse(null);
    }

    public Product updateProduct(Product product) {
        var productIndex = IntStream.range(0, PRODUCTS.size())
                .filter(index -> PRODUCTS.get(index).getProductCode().equals(product.getProductCode()))
                .findFirst().orElse(-1);
        if (productIndex > -1) {
            PRODUCTS.set(productIndex, product);
            return product;
        }
        return null;
    }

    public Product saveProduct(Product product) {
        PRODUCTS.add(product);
        return product;
    }

    public void deleteProduct(Long productCode) {
        var product = findByProductCode(productCode);
        if (product != null) {
            PRODUCTS.remove(product);
        }
    }
}
