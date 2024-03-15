package com.enigma.kingcaffe_java.repository;

import com.enigma.kingcaffe_java.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
}
