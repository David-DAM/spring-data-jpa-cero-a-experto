package com.davinchicoder.spring_data_jpa_cero_a_experto.product.application.query.getAll;

import com.davinchicoder.spring_data_jpa_cero_a_experto.common.application.mediator.Request;
import com.davinchicoder.spring_data_jpa_cero_a_experto.common.domain.PaginationQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetAllProductRequest implements Request<GetAllProductResponse> {

    PaginationQuery paginationQuery;

}
