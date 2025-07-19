package com.davinchicoder.spring_data_jpa_cero_a_experto.product.domain.entity;

import com.davinchicoder.spring_data_jpa_cero_a_experto.productDetail.domain.ProductDetail;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;

    private ProductDetail productDetail;

}
