package com.sap.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}

@RestController
@RequestMapping("/api")
final class Api {

    @GetMapping(value = "/public")
    ResponseEntity search() {
        return ResponseEntity.ok("This content is for all authenticated users.");
    }

    @GetMapping(value = "/confidential")
    ResponseEntity numberOfDocuments() {
        return ResponseEntity.ok("This content is confidential");
    }

}