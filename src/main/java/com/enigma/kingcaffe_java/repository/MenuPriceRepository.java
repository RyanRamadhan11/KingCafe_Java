package com.enigma.kingcaffe_java.repository;

import com.enigma.kingcaffe_java.entity.MenuPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuPriceRepository extends JpaRepository<MenuPrice, String> {
//    Optional<ProductPrice> findByProduct_IdAndIsActive(String productId, Boolean active);
}
