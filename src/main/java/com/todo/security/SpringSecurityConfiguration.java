package com.todo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
    /**
     * Create custom user and encode password
     * @return inmemoryuserdetailsmanager
     */
    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager(){
        UserDetails user1 = createNewUser("Divya", "password");
        UserDetails user2 = createNewUser("Vikas", "vikas123");
        return new InMemoryUserDetailsManager(user1, user2);
    }

    private UserDetails createNewUser(String username, String password) {
        UserDetails userDetails = User.builder()
                .passwordEncoder(input -> passwordEncoder().encode(input)) //encode input password.
                .username(username)
                .password(password)
                .roles("USER", "ADMIN")
                .build();
        return userDetails;
    }

    /**
     * Using BCryptPasswordEncoder, spring encodes and checks if the entered password matches.
     * @return passwordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
