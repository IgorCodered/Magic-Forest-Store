package com.magicforest.magicforest.service.impl;

import com.magicforest.magicforest.model.entity.products.keyboard.Keyboard;
import com.magicforest.magicforest.repository.KeyboardRepository;
import com.magicforest.magicforest.service.KeyboardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class KeyboardServiceImpl implements KeyboardService {

    private final KeyboardRepository repository;

    @Override
    public List<Keyboard> getAllKeyboards() {
        return repository.findAll();
    }

    @Override
    public Keyboard add(Keyboard keyboard) {
        return repository.save(keyboard);
    }
}
