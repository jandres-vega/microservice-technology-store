package com.store.technology.authentication.web.utils;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.auth0.jwt.JWT;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {

//    @Value("${SECRET}")
    private static final String SECRET = "secret";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);

    public String createToken(String email){
        return JWT.create()
                .withSubject(email)
                .withIssuer("market_tech")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15)))
                .sign(ALGORITHM);
    }

    public boolean isValidToken(String token){
        try {
            JWT.require(ALGORITHM).build().verify(token);
            return true;
        } catch (JWTVerificationException e){
            return false;
        }
    }

    public String getEmailFromToken(String token){
        return JWT.require(ALGORITHM).build().verify(token).getSubject();
    }
}
