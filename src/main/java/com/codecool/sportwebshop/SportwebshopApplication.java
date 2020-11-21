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
                    .name("USAV SLEEVELESS HOODIE ")
                    .price(55)
                    .imgSrc("ezegylink")
                    .productType(ProductType.HOODIE)
                    .size(Map.of("XS", 1, "S", 1, "M", 1, "L", 1, "XL", 1, "XXL", 1, "XXXL", 1))
                    .build();
            productRepository.saveAndFlush(product1);
            Product product2 = Product.builder()
                    .name("USAV SHORT SLEEVE HOODIE")
                    .price(70)
                    .imgSrc("ezegylink")
                    .productType(ProductType.HOODIE)
                    .size(Map.of("XS", 1, "S", 1, "M", 1, "L", 1, "XL", 1, "XXL", 1, "XXXL", 1))
                    .build();
            productRepository.saveAndFlush(product2);
            Product product3 = Product.builder()
                    .name("USAV CREW NECK")
                    .price(65)
                    .imgSrc("ezegylink")
                    .productType(ProductType.HOODIE)
                    .size(Map.of("2XS", 1, "XS", 1, "S", 1, "M", 1, "L", 1, "XL", 1, "XXL", 1, "XXXL", 1))
                    .build();
            productRepository.saveAndFlush(product3);
            Product product4 = Product.builder()
                    .name("USAV ZNE HOODIE")
                    .price(100)
                    .imgSrc("ezegylink")
                    .productType(ProductType.HOODIE)
                    .size(Map.of("XS", 1, "S", 1, "M", 1, "L", 1, "XL", 1, "XXL", 1, "XXXL", 1))
                    .build();
            productRepository.saveAndFlush(product4);
            Product product5 = Product.builder()
                    .name("USAV ZIP HOODIE")
                    .price(80)
                    .imgSrc("ezegylink")
                    .productType(ProductType.HOODIE)
                    .size(Map.of("XS", 1, "S", 1, "M", 1, "L", 1, "XL", 1, "XXL", 1, "XXXL", 1))
                    .build();
            productRepository.saveAndFlush(product5);
            Product product6 = Product.builder()
                    .name("USAV ALL-W JACKET")
                    .price(100)
                    .imgSrc("ezegylink")
                    .productType(ProductType.OTHER)
                    .size(Map.of("XS", 1, "S", 1, "M", 1, "L", 1, "XL", 1, "XXL", 1, "XXXL", 1))
                    .build();
            productRepository.saveAndFlush(product5);
        };
    }

}
