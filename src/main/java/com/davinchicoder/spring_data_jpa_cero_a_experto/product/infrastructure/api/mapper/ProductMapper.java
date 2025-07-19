package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.mapper;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.application.command.create.CreateProductRequest;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.application.command.update.UpdateProductRequest;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.domain.entity.Product;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto.CreateProductDto;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto.ProductDto;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto.UpdateProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductMapper {

    CreateProductRequest mapToCreateProductRequest(CreateProductDto createProductDto);

    UpdateProductRequest mapToUpdateProductRequest(UpdateProductDto updateProductDto);

    @Mapping(target = "provider", source = "productDetail.provider")
    ProductDto mapToProductDto(Product product);

}
