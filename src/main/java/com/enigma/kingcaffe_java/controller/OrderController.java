package com.enigma.kingcaffe_java.controller;


import com.enigma.kingcaffe_java.constant.AppPath;
import com.enigma.kingcaffe_java.dto.request.OrderRequest;
import com.enigma.kingcaffe_java.dto.response.CommonResponse;
import com.enigma.kingcaffe_java.dto.response.OrderResponse;
import com.enigma.kingcaffe_java.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AppPath.ORDER)
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse = orderService.createNewOrder(orderRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<OrderResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully created new order")
                        .data(orderResponse)
                        .build());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable String id) {
        OrderResponse orderResponse = orderService.getOrderById(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<OrderResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Successfully get order by id")
                        .data(orderResponse)
                        .build());
    }

    @GetMapping
    public ResponseEntity<?> getAllOrder() {
        List<OrderResponse> orderResponses = orderService.getAllOrder();

        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<List<OrderResponse>>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Successfully get all orders")
                        .data(orderResponses)
                        .build());
    }

}

