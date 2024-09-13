package com.github.h3nriquel1ma.authenticationserviceapi.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.dao.DataAccessException;

import java.util.Map;


@RestController
@RequestMapping("/authenticate")
public class ClientAuthController {

    @PostMapping("/login")
    public ResponseEntity<Object> loginClient() {
        try {


        } catch (DataAccessException error) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "An error occurred connecting to the database!", "code", 500));
        }
    }
}
