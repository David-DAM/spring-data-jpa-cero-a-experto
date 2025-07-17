package com.davinchicoder.spring_data_jpa_cero_a_experto.common.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
//@EnableScheduling
@EnableCaching
public class ApplicationConfig {
}
