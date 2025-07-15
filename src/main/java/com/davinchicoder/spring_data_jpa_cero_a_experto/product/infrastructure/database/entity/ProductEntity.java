package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.entity;

import lombok.Data;

@Data
public class ProductEntity {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;

}
