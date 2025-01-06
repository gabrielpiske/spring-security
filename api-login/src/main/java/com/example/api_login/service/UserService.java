package com.example.api_login.service;

import com.example.api_login.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private static final String EXISTING_EMAIL = "test@test.com";

    public Optional<UserEntity> findByEmail(String email){
        // TODO: Colocar isso num banco de dados
        if(!EXISTING_EMAIL.equalsIgnoreCase(email)) return Optional.empty();

        var user = new UserEntity();
        user.setId(1L);
        user.setEmail(EXISTING_EMAIL);
        user.setPassword("$2a$12$jL9X/pQ0.ObadpomId.D5ucFaQgAY.Ck5lg8dRmfWX4kvJGrBdbna"); // test
        user.setRole("ROLE_ADMIN");
        user.setExtraInfo("É o admin");
        return Optional.of(user);
    }
}
