package com.enigma.kingcaffe_java.repository;

import com.enigma.kingcaffe_java.entity.Kasir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KasirRepository extends JpaRepository<Kasir, String> {
}