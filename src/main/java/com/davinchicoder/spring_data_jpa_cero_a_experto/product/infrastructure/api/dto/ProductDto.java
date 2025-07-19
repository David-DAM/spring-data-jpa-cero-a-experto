package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;
    private String provider;

}
