package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.dto.request.OrderRequest;
import com.enigma.kingcaffe_java.dto.response.OrderResponse;

import java.util.List;

public interface OrderService {
    OrderResponse createNewOrder(OrderRequest orderRequest);
    OrderResponse getOrderById(String id);
    List<OrderResponse> getAllOrder();

}
