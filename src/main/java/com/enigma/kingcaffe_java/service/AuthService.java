package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.dto.request.AuthRequest;
import com.enigma.kingcaffe_java.dto.response.LoginResponse;
import com.enigma.kingcaffe_java.dto.response.RegisterResponse;

public interface AuthService {
    RegisterResponse registerCustomer(AuthRequest request);

    RegisterResponse registerKasir(AuthRequest request);

    RegisterResponse registerAdmin(AuthRequest request);

    LoginResponse login(AuthRequest authRequest);
}
