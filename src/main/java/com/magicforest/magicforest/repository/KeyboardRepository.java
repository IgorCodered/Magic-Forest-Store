package com.magicforest.magicforest.repository;


import com.magicforest.magicforest.model.entity.products.keyboard.Keyboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyboardRepository extends JpaRepository<Keyboard, Long> {

}
