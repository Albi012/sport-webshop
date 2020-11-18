package com.codecool.sportwebshop;

import com.codecool.sportwebshop.model.Product;
import com.codecool.sportwebshop.model.ProductType;
import com.codecool.sportwebshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SportwebshopApplication {

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SportwebshopApplication.class, args);
    }

    @Bean
    @Profile("production")
    CommandLineRunner init() {
        return args -> {
            Product product1 = Product.builder()
                    .name("TestProduct")
                    .price(2000)
                    .imgSrc("ezegylink")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product1);
            Product product2 = Product.builder()
                    .name("TestProduct2")
                    .price(3000)
                    .imgSrc("ezegylink")
                    .productType(ProductType.OTHER)
                    .build();
            productRepository.saveAndFlush(product2);
            Product product3 = Product.builder()
                    .name("TestProduct3")
                    .price(2000)
                    .imgSrc("ezegylink")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product3);
            Product product4 = Product.builder()
                    .name("TestProduct4")
                    .price(31000)
                    .imgSrc("ezegylink")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product4);
        };
    }

}
