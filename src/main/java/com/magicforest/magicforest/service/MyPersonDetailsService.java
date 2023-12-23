package com.magicforest.magicforest.service;

import com.magicforest.magicforest.config.MyUserDetails;
import com.magicforest.magicforest.model.Person;
import com.magicforest.magicforest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyPersonDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = userRepository.findByUsername(username);
        return person.map(MyUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(username + " не найден"));
    }
}
