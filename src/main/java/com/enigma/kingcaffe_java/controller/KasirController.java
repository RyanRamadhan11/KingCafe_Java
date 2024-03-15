package com.enigma.kingcaffe_java.controller;


import com.enigma.kingcaffe_java.constant.AppPath;
import com.enigma.kingcaffe_java.dto.request.AuthRequest;
import com.enigma.kingcaffe_java.dto.request.KasirRequest;
import com.enigma.kingcaffe_java.dto.response.CommonResponse;
import com.enigma.kingcaffe_java.dto.response.KasirResponse;
import com.enigma.kingcaffe_java.service.KasirService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AppPath.KASIR)
@RequiredArgsConstructor
public class KasirController {

    private final KasirService kasirService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping
    public ResponseEntity<?> createKasir(@RequestBody AuthRequest request) {
        KasirResponse kasirResponse = kasirService.create(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<KasirResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully created new Kasir")
                        .data(kasirResponse)
                        .build());
    }

    @PutMapping
    public ResponseEntity<?> updateKasir(@RequestBody KasirRequest kasirRequest) {
        KasirResponse kasirResponse = kasirService.update(kasirRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<KasirResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully Updated Kasir")
                        .data(kasirResponse)
                        .build());
    }

    @GetMapping
    public ResponseEntity<?> getAllKasir() {
        List<KasirResponse> kasirList = kasirService.getAll();

        return ResponseEntity.ok(
                CommonResponse.<List<KasirResponse>>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Successfully retrieved all kasir")
                        .data(kasirList)
                        .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getKasirById(@PathVariable String id) {
        KasirResponse kasirResponse = kasirService.getById(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<KasirResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Successfully get kasir by id")
                        .data(kasirResponse)
                        .build());

    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteKasir(@PathVariable String id) {
        kasirService.delete(id);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully Delete Kasir")
                        .data(HttpStatus.OK)
                        .build());
    }

}

