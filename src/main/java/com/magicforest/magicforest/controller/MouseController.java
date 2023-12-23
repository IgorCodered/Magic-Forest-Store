package com.magicforest.magicforest.controller;

import com.magicforest.magicforest.model.Person;
import com.magicforest.magicforest.model.entity.products.mouse.Mouse;
import com.magicforest.magicforest.service.MouseService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class MouseController {

    private final MouseService service;

    @GetMapping("/welcome")
    public String hello() {
        return "Hello boy!";
    }

    @GetMapping("/mouses")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<Mouse> findAllMouse(Model model) {
        List<Mouse> mouse = service.findAllMouse();
//        model.addAttribute("name",mouse);
        return mouse;
    }

    @PostMapping("/add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String mouseAdd(@RequestBody Mouse mouse) {
        service.saveMouse(mouse);
        return "Mouse save successful";
    }

    @GetMapping("/mouses/{id}")
    public Optional<Mouse> findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("/new-user")
    public String addUser(@RequestBody Person person) {
        service.addUser(person);
        return "Пользователь успешно добавлен";
    }
}

