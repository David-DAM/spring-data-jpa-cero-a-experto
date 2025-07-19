package com.davinchicoder.spring_data_jpa_cero_a_experto.productDetail.infrastructure;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.entity.ProductEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product_details")
public class ProductDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specifications;
    private String warranty;
    private String provider;

    @OneToOne(mappedBy = "productDetailEntity")
    private ProductEntity productEntity;

}
