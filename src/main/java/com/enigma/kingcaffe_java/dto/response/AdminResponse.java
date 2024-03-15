package com.enigma.kingcaffe_java.dto.response;

import com.enigma.kingcaffe_java.entity.UserCredential;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AdminResponse{
    private String id;

    private String name;

    private String email;

    private String phoneNumber;

    private UserCredential userCredential;
}
