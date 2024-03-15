package com.enigma.kingcaffe_java.repository;

import com.enigma.kingcaffe_java.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    Category findByCategoryCode (String categoryCode);

}
