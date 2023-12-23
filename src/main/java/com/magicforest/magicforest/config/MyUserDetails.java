package com.magicforest.magicforest.config;

import com.magicforest.magicforest.model.Person;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Этот сервис MyPersonDetailsService реализует интерфейс UserDetailsService в Spring Security.
 * Он используется для загрузки информации о пользователе в систему аутентификации Spring Security.
 * <p>
 * Простыми словами, когда кто-то пытается войти в систему с указанным именем пользователя (username),
 * Spring Security обращается к методу loadUserByUsername. Этот метод ищет пользователя в базе данных
 * (в нашем случае, в репозитории UserRepository) по имени пользователя (username).
 * <p>
 * Если пользователь найден, loadUserByUsername создает объект MyUserDetails
 * (класс, который, вероятно, содержит информацию о пользователе) и возвращает его.
 * <p>
 * MyUserDetails вероятно содержит информацию о пользователе, такую как
 * его имя, пароль, роли и другие атрибуты, которые могут использоваться Spring Security
 * для аутентификации и авторизации пользователя при попытке входа в систему.
 * <p>
 * Таким образом, этот сервис MyPersonDetailsService позволяет Spring Security
 * получить информацию о пользователе из вашей базы данных для осуществления
 * процесса аутентификации (проверка подлинности пользователя при входе в систему)
 * и авторизации (определение прав доступа пользователя).
 **/

public class MyUserDetails implements UserDetails {

    private final Person person;

    public MyUserDetails(Person person) {
        this.person = person;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.stream(person.getRoles().split(", "))
                .map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return person.getPassword();
    }

    @Override
    public String getUsername() {
        return person.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
