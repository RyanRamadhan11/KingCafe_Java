package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.dto.request.AuthRequest;
import com.enigma.kingcaffe_java.dto.request.CustomerRequest;
import com.enigma.kingcaffe_java.dto.response.CustomerResponse;
import com.enigma.kingcaffe_java.entity.Customer;

import java.util.List;

public interface CustomerService {
    CustomerResponse create(AuthRequest request);

    CustomerResponse update(CustomerRequest customerRequest);

    CustomerResponse createNewCustomer(Customer request);

    void delete(String id);

    CustomerResponse getById(String id);

    List<CustomerResponse> getAll();
}
