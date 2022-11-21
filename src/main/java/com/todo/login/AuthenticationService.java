package com.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    boolean authenticate(String name, String password){
        return name.equalsIgnoreCase("divya") && password.equalsIgnoreCase("pass");
    }
}
