package com.enigma.kingcaffe_java.repository;

import com.enigma.kingcaffe_java.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}