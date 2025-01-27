package com.dk.security.jwt.security;

import com.dk.security.jwt.entity.Role;
import com.dk.security.jwt.entity.User;
import com.dk.security.jwt.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class JwtUtil {

    // Secret key
    private static final SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    // Expiration time
    private final int jwtExpirationTime = 86400000;

    private final UserRepository userRepository;

    public JwtUtil(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Generate Token
    public String generateToken(String username) {
        Optional<User> user = UserRepository.findByUserName(username);

        if (user.isEmpty()) {
            throw new IllegalArgumentException("User not found with username: " + username);
        }

        Set<Role> roles = user.get().getRoles();

        // Add roles to the token
        return Jwts.builder()
                .setSubject(username)
                .claim("roles", roles.stream()
                        .map(Role::getName)
                        .collect(Collectors.joining(",")))
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + jwtExpirationTime))
                .signWith(secretKey)
                .compact();
    }

    //Extract username
    public String extractUserName(String token) {
        return Jwts.parserBuilder().setSigningKey(secretKey).
                build().parseClaimsJwt(token).getBody().getSubject();
    }

    //Extract Password
    public Set<String> extractRoles(String token) {
        String roleString = Jwts.parserBuilder().setSigningKey(secretKey).
                build().parseClaimsJwt(token).getBody().get("role", String.class);
        return Set.of(roleString);
    }

    //Token validataion

    public boolean isToKenvalid(String token){
        try{
            Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJwt(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
