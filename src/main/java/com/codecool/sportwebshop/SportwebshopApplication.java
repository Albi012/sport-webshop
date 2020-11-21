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
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/1.png?alt=media&token=c5b67ea2-6ebb-458a-9d23-c2ca109e6eaa")
                    .productType(ProductType.HOODIE)
                    .size(List.of("XS", "S", "M", "L", "XL", "XXL", "XXXL"))
                    .build();
            productRepository.saveAndFlush(product1);
            Product product2 = Product.builder()
                    .name("USAV SHORT SLEEVE HOODIE")
                    .price(70)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/2.png?alt=media&token=b0889fdc-dd62-4b96-a612-baf6e710c23c")
                    .productType(ProductType.HOODIE)
                    .size(List.of("XS", "S", "M", "L", "XL", "XXL", "XXXL"))
                    .build();
            productRepository.saveAndFlush(product2);
            Product product3 = Product.builder()
                    .name("USAV CREW NECK")
                    .price(65)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/6.png?alt=media&token=99fc439b-2af7-4ff0-beb5-0929cf397964")
                    .productType(ProductType.HOODIE)
                    .size(List.of("XXS", "XS", "S", "M", "L", "XL", "XXL", "XXXL"))
                    .build();
            productRepository.saveAndFlush(product3);
            Product product4 = Product.builder()
                    .name("USAV ZNE HOODIE ")
                    .price(100)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/3.png?alt=media&token=db98cb96-fb06-414b-b537-4ccdd653996a")
                    .productType(ProductType.HOODIE)
                    .size(List.of("XS", "S", "M", "L", "XL", "XXL", "XXXL"))
                    .build();
            productRepository.saveAndFlush(product4);
            Product product5 = Product.builder()
                    .name("USAV ZIP HOODIE")
                    .price(80)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/4.png?alt=media&token=de43c999-8970-4dc1-a3e3-f54dd8e60b5a")
                    .productType(ProductType.HOODIE)
                    .size(List.of("XXS", "XS", "S", "M", "L", "XL", "XXL", "XXXL"))
                    .build();
            productRepository.saveAndFlush(product5);
            Product product6 = Product.builder()
                    .name("USAV ALL-W JACKET")
                    .price(100)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/5.png?alt=media&token=4d6f2f61-f278-4ee4-bed6-92bef0fc357c")
                    .productType(ProductType.OTHER)
                    .size(List.of("XXS", "XS", "S", "M", "L", "XL", "XXL", "XXXL"))
                    .build();
            productRepository.saveAndFlush(product6);
        };
    }

}
