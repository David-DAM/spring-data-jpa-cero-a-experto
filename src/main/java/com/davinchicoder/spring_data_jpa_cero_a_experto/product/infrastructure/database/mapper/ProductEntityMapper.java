package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.mapper;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.domain.entity.Product;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.entity.ProductEntity;
import com.davinchicoder.spring_data_jpa_cero_a_experto.review.domain.Review;
import com.davinchicoder.spring_data_jpa_cero_a_experto.review.infrastructure.ReviewEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductEntityMapper {


    @Mapping(target = "productDetail.product", ignore = true)
    ProductEntity mapToProductEntity(Product product);

    @Mapping(target = "productDetail.product", ignore = true)
    Product mapToProduct(ProductEntity productEntity);

    @Mapping(target = "product", ignore = true)
    Review maptoReview(ReviewEntity reviewEntity);

    @Mapping(target = "product", ignore = true)
    ReviewEntity mapToReviewEntity(Review review);

}
