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
                    .build();
            productRepository.saveAndFlush(product1);
            Product product2 = Product.builder()
                    .name("USAV SHORT SLEEVE HOODIE")
                    .price(70)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/2.png?alt=media&token=b0889fdc-dd62-4b96-a612-baf6e710c23c")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product2);
            Product product3 = Product.builder()
                    .name("USAV CREW NECK")
                    .price(65)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/6.png?alt=media&token=99fc439b-2af7-4ff0-beb5-0929cf397964")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product3);
            Product product4 = Product.builder()
                    .name("USAV ZNE HOODIE ")
                    .price(100)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/3.png?alt=media&token=db98cb96-fb06-414b-b537-4ccdd653996a")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product4);
            Product product5 = Product.builder()
                    .name("USAV ZIP HOODIE")
                    .price(80)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/4.png?alt=media&token=de43c999-8970-4dc1-a3e3-f54dd8e60b5a")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product5);
            Product product6 = Product.builder()
                    .name("USAV ALL-W JACKET")
                    .price(100)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/5.png?alt=media&token=4d6f2f61-f278-4ee4-bed6-92bef0fc357c")
                    .productType(ProductType.OTHER)
                    .build();
            productRepository.saveAndFlush(product6);
            Product product7 = Product.builder()
                    .name("TEAM 19 TRACK JACKET ")
                    .price(60)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/11.png?alt=media&token=7d812396-79d7-4ca5-b8c9-57a103f363a8")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product7);
            Product product8 = Product.builder()
                    .name("GAME MODE TRAINING HOOD")
                    .price(60)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/9.png?alt=media&token=2e367686-25bc-4a7c-ab79-67e78c0a6883")
                    .productType(ProductType.HOODIE)
                    .build();
            productRepository.saveAndFlush(product8);
            Product product9 = Product.builder()
                    .name("TEAM 19 KNIT SHORT ")
                    .price(30)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/10.png?alt=media&token=9c1eb19d-daba-40db-9a2f-f99184ba1e4b")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product9);
            Product product10 = Product.builder()
                    .name("TEAM 19 SINGLET")
                    .price(30)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/7.png?alt=media&token=7d394ad1-d6ef-4068-a8b1-25fb06d01101")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product10);
            Product product11 = Product.builder()
                    .name("ALPHASKIN SHORT SLEEVE TOP")
                    .price(20)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/62v.png?alt=media&token=ab6f2227-fc1e-4837-bb1b-dac1e5199725")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product11);
            Product product12 = Product.builder()
                    .name("CLIMA TECH TEE")
                    .price(15)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/51v.png?alt=media&token=84d45962-8a38-4fd8-bc3c-12edbb792521")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product12);
            Product product13 = Product.builder()
                    .name("AMPLIFIER SHORT SLEEVE TEE")
                    .price(15)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/52v.png?alt=media&token=0882591f-15ab-45a4-b39e-28799c9470a2")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product13);
            Product product14 = Product.builder()
                    .name("COMFORT FLEECE 3.0")
                    .price(25)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/123v3.png?alt=media&token=205266b2-f8b0-41cb-8a51-6cf7281fc5ae")
                    .productType(ProductType.OTHER)
                    .build();
            productRepository.saveAndFlush(product14);
            Product product15 = Product.builder()
                    .name("COMFORT FLEECE 3.0")
                    .price(25)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/123v3.png?alt=media&token=205266b2-f8b0-41cb-8a51-6cf7281fc5ae")
                    .productType(ProductType.OTHER)
                    .build();
            productRepository.saveAndFlush(product15);
            Product product16 = Product.builder()
                    .name("ZONYK MID")
                    .price(159)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/124v1.png?alt=media&token=0757ca92-4187-4e81-ac00-d19d8b7e229a")
                    .productType(ProductType.OTHER)
                    .build();
            productRepository.saveAndFlush(product16);
            Product product17 = Product.builder()
                    .name("ULTIMATE POLO")
                    .price(60)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/87v2.png?alt=media&token=b5a2013d-fc06-414d-89d0-b9472d07785c")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product17);
            Product product18 = Product.builder()
                    .name("VOYAGER")
                    .price(28)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/123v2.png?alt=media&token=811857c4-c4e1-454e-addc-bb7fcf636d14")
                    .productType(ProductType.OTHER)
                    .build();
            productRepository.saveAndFlush(product18);
            Product product19 = Product.builder()
                    .name("ULTIMATE TEXTURED STRIPE POLO")
                    .price(75)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/87v3.png?alt=media&token=56a52b4e-5e77-467c-adcb-b9df2d0460a2")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product19);
            Product product20 = Product.builder()
                    .name("ULTIMATE 3-STRIPE POLO ")
                    .price(70)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/87v.png?alt=media&token=f2177db0-6b77-422b-8bd6-cf64f632c5a0")
                    .productType(ProductType.TSHIRT)
                    .build();
            productRepository.saveAndFlush(product20);
            Product product21 = Product.builder()
                    .name("CREATOR 365 SHORT")
                    .price(45)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/9a1.png?alt=media&token=7b744701-d503-4c2c-95f8-d05b96474def")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product21);
            Product product22 = Product.builder()
                    .name("CREATOR 365 SHORT")
                    .price(45)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/9a2.png?alt=media&token=b78f22ba-80e0-4f1f-99f3-b0d6fd427f0b")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product22);
            Product product23 = Product.builder()
                    .name("CRAZY EXPLOSIVE SHORT")
                    .price(35)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/12a.png?alt=media&token=e899de12-1e31-4bb1-9771-f3ebc6da8f12")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product23);
            Product product24 = Product.builder()
                    .name("FACEOFF PANT SHELL")
                    .price(42)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/54a.png?alt=media&token=1c8b49fb-56f9-46a8-bed8-45ca79254b65")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product24);
            Product product25 = Product.builder()
                    .name("TEAM 19 3-POCKETSHORT")
                    .price(40)
                    .imgSrc("https://firebasestorage.googleapis.com/v0/b/sport-webshop.appspot.com/o/63a.png?alt=media&token=fa9a284f-4661-45a8-9444-2ae37b241e94")
                    .productType(ProductType.PANTS)
                    .build();
            productRepository.saveAndFlush(product25);
        };
    }

}
