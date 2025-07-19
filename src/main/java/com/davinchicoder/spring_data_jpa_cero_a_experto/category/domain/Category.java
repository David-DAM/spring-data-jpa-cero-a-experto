package com.davinchicoder.spring_data_jpa_cero_a_experto.category.domain;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.domain.entity.Product;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Category {

    private Long id;
    private String name;

    List<Product> products;

}
