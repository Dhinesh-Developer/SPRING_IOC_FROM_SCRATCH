package com.dk.security.jwt.repository;

import com.dk.security.jwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository {

    Optional<Role> findByName(String name);
}
