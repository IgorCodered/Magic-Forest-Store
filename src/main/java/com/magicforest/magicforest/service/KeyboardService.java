package com.magicforest.magicforest.service;

import com.magicforest.magicforest.model.entity.products.keyboard.Keyboard;

import java.util.List;

public interface KeyboardService {
    List<Keyboard> getAllKeyboards();
    Keyboard add(Keyboard keyboard);

}
