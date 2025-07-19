package com.davinchicoder.spring_data_jpa_cero_a_experto.productDetail.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryProductDetailRepository extends JpaRepository<ProductDetailEntity, Long> {
}
