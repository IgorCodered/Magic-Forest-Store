package com.magicforest.magicforest.controller;


import com.magicforest.magicforest.model.entity.products.keyboard.Keyboard;
import com.magicforest.magicforest.service.KeyboardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/keyboards")
@AllArgsConstructor
public class KeyboardController {

    private final KeyboardService service;

    @GetMapping
    public List<Keyboard> getAllKeyboards() {
        return service.getAllKeyboards();
    }

    @PostMapping("/addKeyboard")
    public Keyboard add(Keyboard keyboard) {
        return service.add(keyboard);
    }
}
