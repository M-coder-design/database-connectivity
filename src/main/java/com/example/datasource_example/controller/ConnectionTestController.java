package com.example.datasource_example.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionTestController {

    private final JdbcTemplate jdbcTemplate;

    public ConnectionTestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/test-connection")
    public String testConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return "Connection Successful!";
        } catch (Exception e) {
            return "Connection Failed: " + e.getMessage();
        }
    }
}
