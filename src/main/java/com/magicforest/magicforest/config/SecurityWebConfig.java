package com.magicforest.magicforest.config;

import com.magicforest.magicforest.service.MyPersonDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityWebConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        return new MyPersonDetailsService();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers("api/v1/welcome", "api/v1/new-user").permitAll()
                                .requestMatchers("api/v1/**").authenticated())
                .formLogin(AbstractAuthenticationFilterConfigurer::permitAll).build();
    }

    /**
     * Метод который кодирует пароль полученный от пользователя
     *
     * @return PasswordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Устанавливает пользовательский сервис данных:
     * provider.setUserDetailsService(userDetailsService()) - Указывает, какой сервис будет использоваться
     * для получения информации о пользователях.
     * Этот сервис используется для поиска пользователей в базе данных или другом источнике данных для аутентификации.
     * <p>
     * Устанавливает кодировщик паролей:
     * provider.setPasswordEncoder(passwordEncoder()) - Определяет метод шифрования для паролей пользователей.
     * Это важно для безопасного хранения паролей в базе данных или другом хранилище.
     *
     * @return В конечном итоге, данный метод возвращает настроенный объект DaoAuthenticationProvider,
     * который используется Spring Security для проверки подлинности (аутентификации) пользователей при попытке входа в систему.
     */
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }
}
