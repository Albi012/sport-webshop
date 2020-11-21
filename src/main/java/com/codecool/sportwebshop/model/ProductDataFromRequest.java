package com.codecool.sportwebshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDataFromRequest {

    String name;
    int price;
    String imgSrc;
    @Enumerated(EnumType.STRING)
    ProductType productType;
    @ElementCollection
    List<String> size;

}
