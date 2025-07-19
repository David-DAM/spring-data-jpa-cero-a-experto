package com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.seeder;

import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.entity.ProductEntity;
import com.davinchicoder.spring_data_jpa_cero_a_experto.product.infrastructure.database.repository.QueryProductRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductSeeder implements CommandLineRunner {

    private final QueryProductRepository productRepository;
    private final ResourceLoader resourceLoader;
    private final ObjectMapper objectMapper;

    @Override
    public void run(String... args) throws Exception {

        long count = productRepository.count();

        if (count == 0) {

            Resource resource = resourceLoader.getResource("classpath:products.json");

            List<ProductEntity> products = objectMapper.readValue(resource.getInputStream(), new TypeReference<>() {
            });

            productRepository.saveAll(products);
        }

    }
}
