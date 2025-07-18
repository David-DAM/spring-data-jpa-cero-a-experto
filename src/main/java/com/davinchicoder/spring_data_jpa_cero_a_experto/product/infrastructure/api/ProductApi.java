package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api;

import com.davinchicoder.spring_data_jpa_cero_a_experto.common.domain.PaginationResult;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto.CreateProductDto;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto.ProductDto;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.api.dto.UpdateProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductApi {

    ResponseEntity<PaginationResult<ProductDto>> getAllProducts(int pageNumber, int pageSize, String sortBy, String direction);

    ResponseEntity<ProductDto> getProductById(@PathVariable Long id);

    ResponseEntity<Void> saveProduct(@RequestBody CreateProductDto productDto);

    ResponseEntity<Void> updateProduct(@RequestBody UpdateProductDto productDto);

    ResponseEntity<Void> deleteProduct(@PathVariable Long id);

}
