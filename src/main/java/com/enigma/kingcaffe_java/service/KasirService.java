package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.dto.request.AuthRequest;
import com.enigma.kingcaffe_java.dto.request.KasirRequest;
import com.enigma.kingcaffe_java.dto.response.KasirResponse;

import java.util.List;

public interface KasirService {

    KasirResponse create(AuthRequest request);

    KasirResponse update(KasirRequest kasirRequest);

    void delete(String id);

    KasirResponse getById(String id);

    List<KasirResponse> getAll();
}
