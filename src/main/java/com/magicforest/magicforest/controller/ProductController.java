package com.magicforest.magicforest.controller;

import com.magicforest.magicforest.model.entity.products.Product;
import com.magicforest.magicforest.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/magicforest")
public class ProductController {

    private final ProductService service;

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.findAllProducts();
    }

    @PostMapping("/save_product")
    public String saveProduct(@RequestBody Product product) {
        service.saveProduct(product);
        return "Product added successful";
    }

    public Product findByProductCode(@PathVariable Long code) {
        return service.findByProductCode(code);
    }


    @PutMapping("/update_product")
    public Product updateProduct(Product product) {
        return service.updateProduct(product);
    }


    @DeleteMapping("/delete_product/{id}")
    @Transactional
    public void deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
    }
}
