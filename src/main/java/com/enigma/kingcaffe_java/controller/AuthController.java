package com.enigma.kingcaffe_java.controller;


import com.enigma.kingcaffe_java.constant.AppPath;
import com.enigma.kingcaffe_java.dto.request.AuthRequest;
import com.enigma.kingcaffe_java.dto.response.CommonResponse;
import com.enigma.kingcaffe_java.dto.response.LoginResponse;
import com.enigma.kingcaffe_java.dto.response.RegisterResponse;
import com.enigma.kingcaffe_java.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(AppPath.AUTH)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register/admin")
    public ResponseEntity<?> registerAdmin(@RequestBody AuthRequest authRequest) {
        RegisterResponse registerResponse = authService.registerAdmin(authRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<RegisterResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully created register new Admin")
                        .data(registerResponse)
                        .build());
    }

    @PostMapping("/register/kasir")
    public ResponseEntity<?> registerKasir(@RequestBody AuthRequest authRequest) {
        RegisterResponse registerResponse = authService.registerKasir(authRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<RegisterResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully created register new Kasir")
                        .data(registerResponse)
                        .build());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/register/customer")
    public ResponseEntity<?> registerCustomer(@RequestBody AuthRequest authRequest) {
        RegisterResponse registerResponse = authService.registerCustomer(authRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<RegisterResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully created register new customer")
                        .data(registerResponse)
                        .build());
    }


    @PostMapping("/login")
    public ResponseEntity<?> loginCustomer(@RequestBody AuthRequest authRequest) {
        LoginResponse loginResponse = authService.login(authRequest);

        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<LoginResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Successfully Login")
                        .data(loginResponse)
                        .build());
    }
}

