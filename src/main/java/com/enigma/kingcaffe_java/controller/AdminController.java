package com.enigma.kingcaffe_java.controller;

import com.enigma.kingcaffe_java.constant.AppPath;
import com.enigma.kingcaffe_java.dto.response.AdminResponse;
import com.enigma.kingcaffe_java.dto.response.CommonResponse;
import com.enigma.kingcaffe_java.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(AppPath.ADMIN)
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<?> getAllAdmin() {
        List<AdminResponse> adminList = adminService.getAll();

        return ResponseEntity.ok(
                CommonResponse.<List<AdminResponse>>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Successfully retrieved all admin")
                        .data(adminList)
                        .build());
    }
}
