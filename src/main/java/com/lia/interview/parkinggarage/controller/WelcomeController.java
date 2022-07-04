package com.lia.interview.parkinggarage.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {


    @GetMapping()
    @Operation(summary = "Method to check that the application is correctly started")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Simple text")
    )
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, I've been correctly started");
    }
}
