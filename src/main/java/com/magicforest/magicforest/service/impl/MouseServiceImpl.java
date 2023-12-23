package com.magicforest.magicforest.service.impl;

import com.magicforest.magicforest.model.Person;
import com.magicforest.magicforest.model.entity.products.mouse.Mouse;
import com.magicforest.magicforest.repository.MouseRepository;
import com.magicforest.magicforest.repository.UserRepository;
import com.magicforest.magicforest.service.MouseService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MouseServiceImpl implements MouseService {
    private final MouseRepository repository;
    //TODO: возможно сделать отдельный сервис для сохранения пользователей

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public void addUser(Person person) {
        person.setPassword(passwordEncoder.encode(person.getPassword()));
        userRepository.save(person);
    }

    @Override
    public List<Mouse> findAllMouse() {
        return repository.findAll();
    }

    @Override
    public List<Mouse> findByBrand(String brand) {
        return repository.findByCommonBrand(brand);

    }

    @Override
    public List<Mouse> findByTypeLight(String typeLight) {
        return repository.findByCommonTypeLight(typeLight);
    }

    @Override
    public Mouse createMouse(Mouse mouse) {
        return repository.save(mouse);
    }

//    @Override
//    public Mouse updateMouseFields(Long id, MouseFieldsToUpdate fieldsToUpdate) {
//        Mouse updatedMouse = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Мышка не найдена"));
//        //todo
//        if (fieldsToUpdate.getButton().getNumbersOfButtons() != 0) {
//            fieldsToUpdate.setButton(fieldsToUpdate.getButton().getNumbersOfButtons());
//        }
//    }

    @Override
    public void deleteMouse(Mouse mouse) {
        repository.delete(mouse);
    }

    public Mouse saveMouse(Mouse mouse) {
        return repository.save(mouse);
    }

    @Override
    public Optional<Mouse> findById(Long id) {
        return repository.findById(id);
    }
}
