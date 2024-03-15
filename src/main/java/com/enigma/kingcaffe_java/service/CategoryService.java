package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.dto.request.CategoryRequest;
import com.enigma.kingcaffe_java.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {

    List<CategoryResponse> getAll();

    CategoryResponse create(CategoryRequest categoryRequest);

    CategoryResponse update(CategoryRequest categoryRequest);

    void delete(String id);

    CategoryResponse getById(String id);
}
