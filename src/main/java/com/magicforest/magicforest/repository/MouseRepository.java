package com.magicforest.magicforest.repository;

import com.magicforest.magicforest.model.entity.products.mouse.Mouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MouseRepository extends JpaRepository<Mouse, Long>  {
    List<Mouse> findByCommonBrand(String brand);
    List<Mouse> findByCommonTypeLight(String typeLight);

}
