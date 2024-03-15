package com.enigma.kingcaffe_java.repository;

import com.enigma.kingcaffe_java.constant.ERole;
import com.enigma.kingcaffe_java.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
