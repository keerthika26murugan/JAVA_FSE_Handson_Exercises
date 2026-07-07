package com.keerthika.jwtauthentication.util;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    // Minimum 32-byte secret key (Base64 encoded)
    private static final String SECRET =
            "TXlTdXBlclNlY3JldEtleUZvckpXVEF1dGhlbnRpY2F0aW9uMTIzNDU2";

    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    // Extract Username
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    // Extract Expiration
    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    // Extract Any Claim
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {

        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);

    }

    // Extract All Claims
    private Claims extractAllClaims(String token) {

        return Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();

    }

    // Check Expired
    private Boolean isTokenExpired(String token) {

        return extractExpiration(token).before(new Date());

    }

    // Generate Token
    public String generateToken(UserDetails userDetails) {

        Map<String, Object> claims = new HashMap<>();

        return createToken(claims, userDetails.getUsername());

    }

    // Create Token
    private String createToken(Map<String, Object> claims, String subject) {

        return Jwts.builder()

                .setClaims(claims)

                .setSubject(subject)

                .setIssuedAt(new Date(System.currentTimeMillis()))

                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))

                .signWith(getSigningKey(), SignatureAlgorithm.HS256)

                .compact();

    }

    // Validate Token
    public Boolean validateToken(String token, UserDetails userDetails) {

        final String username = extractUsername(token);

        return username.equals(userDetails.getUsername())
                && !isTokenExpired(token);

    }

}
