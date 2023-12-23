package com.magicforest.magicforest.repository;

import com.magicforest.magicforest.model.entity.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {

    Product findByProductCode(Long productCode);
    void deleteByProductCode(Long id);

}
