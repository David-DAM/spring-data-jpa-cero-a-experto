package com.davinchicoder.spring_data_jpa_cero_a_experto.product.domain.port;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product upsert(Product product);

    Optional<Product> findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);
}
