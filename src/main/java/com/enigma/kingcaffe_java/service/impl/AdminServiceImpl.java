package com.enigma.kingcaffe_java.service.impl;

import com.enigma.kingcaffe_java.dto.response.AdminResponse;
import com.enigma.kingcaffe_java.entity.UserCredential;
import com.enigma.kingcaffe_java.repository.AdminRepository;
import com.enigma.kingcaffe_java.service.AdminService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(rollbackOn = Exception.class)
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AdminResponse> getAll() {
        // Gunakan native query untuk mendapatkan semua data customer
        List<Object[]> resultList = entityManager.createNativeQuery(
                        "SELECT id, name, email, phone, user_credential_id FROM m_admin")
                .getResultList();

        return resultList.stream()
                .map(row -> {
                    String userId = (String) row[4];  // Assuming user_credential_id is at index 4
                    UserCredential userCredential = entityManager.find(UserCredential.class, userId);

                    return AdminResponse.builder()
                            .id((String) row[0])
                            .name((String) row[1])
                            .email((String) row[2])
                            .phoneNumber((String) row[3])
                            .userCredential(userCredential)
                            .build();
                })
                .collect(Collectors.toList());
    }



}
