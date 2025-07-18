package com.davinchicoder.spring_data_jpa_cero_a_experto.common.application.mediator;

public interface RequestHandler<T extends Request<R>, R> {

    R handle(T request);

    Class<T> getRequestType();

}
