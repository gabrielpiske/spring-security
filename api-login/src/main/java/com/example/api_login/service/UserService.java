package com.example.api_login.service;

import com.example.api_login.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    // admin
    private static final String EXISTING_EMAIL = "test@test.com";
    // user
    private static final String ANOTHER_EMAIL =  "next@test.com";

    public Optional<UserEntity> findByEmail(String email){
        // TODO: Colocar isso num banco de dados
        if (EXISTING_EMAIL.equalsIgnoreCase(email)){
            var user = new UserEntity();
            user.setId(1L);
            user.setEmail(EXISTING_EMAIL);
            user.setPassword("$2a$12$jL9X/pQ0.ObadpomId.D5ucFaQgAY.Ck5lg8dRmfWX4kvJGrBdbna"); // test
            user.setRole("ROLE_ADMIN");
            user.setExtraInfo("É o admin");
            return Optional.of(user);
        } else if (ANOTHER_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(99L);
            user.setEmail(ANOTHER_EMAIL);
            user.setPassword("$2a$12$jL9X/pQ0.ObadpomId.D5ucFaQgAY.Ck5lg8dRmfWX4kvJGrBdbna"); // test
            user.setRole("ROLE_USER");
            user.setExtraInfo("É o usuario");
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
