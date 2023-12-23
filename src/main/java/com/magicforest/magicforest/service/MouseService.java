package com.magicforest.magicforest.service;

import com.magicforest.magicforest.model.Person;
import com.magicforest.magicforest.model.entity.products.mouse.Mouse;

import java.util.List;
import java.util.Optional;

public interface MouseService {

    void addUser(Person person);
    List<Mouse> findAllMouse();
    List<Mouse> findByBrand(String brand);
    List<Mouse> findByTypeLight(String typeLight);
    Mouse createMouse(Mouse mouse);
    void deleteMouse(Mouse mouse);
    Mouse saveMouse(Mouse mouse);
    Optional<Mouse> findById(Long id);
}
