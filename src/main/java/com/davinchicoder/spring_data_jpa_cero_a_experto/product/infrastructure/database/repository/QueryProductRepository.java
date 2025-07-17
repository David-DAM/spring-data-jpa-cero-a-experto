package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.repository;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryProductRepository extends JpaRepository<ProductEntity, Long> {
    
}
