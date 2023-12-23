package com.magicforest.magicforest.repository;

import com.magicforest.magicforest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Person,Long> {
    Optional<Person> findByUsername(String username);
}
