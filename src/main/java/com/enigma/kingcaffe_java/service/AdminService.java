package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.dto.response.AdminResponse;

import java.util.List;

public interface AdminService {
    List<AdminResponse> getAll();
}