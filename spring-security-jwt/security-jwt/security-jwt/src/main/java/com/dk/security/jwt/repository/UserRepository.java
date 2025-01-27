package com.dk.security.jwt.repository;

import com.dk.security.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository{

    static Optional<User> findByUserName(String username);
}
