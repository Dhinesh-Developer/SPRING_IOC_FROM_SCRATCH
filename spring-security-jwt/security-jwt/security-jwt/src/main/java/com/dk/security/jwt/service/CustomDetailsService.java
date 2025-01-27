package com.dk.security.jwt.service;

import com.dk.security.jwt.entity.User;
import com.dk.security.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.stream.Collectors;

public class CustomDetailsService implements UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    public CustomDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = UserRepository.findByUserName(username).
                orElseThrow(() ->
                        new UsernameNotFoundException("User  not Found "+username));

        // map to roles to
        return new org.springframework.security.core.userdetails.User
                (user.getUsername(),user.getPassword(),user.getRoles()
                        .stream().map(role ->
                                new SimpleGrantedAuthority(role.getName())).
                        collect(Collectors.toList()));
    }
}
