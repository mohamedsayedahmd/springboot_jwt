package com.auth.jwtdemo.controller;

import com.auth.jwtdemo.config.service.TokenService;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private static Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;
    @Autowired
    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }
    @PostMapping("/token")
    public String token(Authentication authentication){
        LOGGER.debug("Token requested for user: '{}'",authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOGGER.debug("Token granted {}", token);
        return token;
    }
}
