package com.codecool.sportwebshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int price;
    String imgSrc;
    @Enumerated(EnumType.STRING)
    ProductType productType;
    @ElementCollection
    List<String> size;
}
