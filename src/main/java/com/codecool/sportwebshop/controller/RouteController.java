package com.codecool.sportwebshop.controller;

import com.codecool.sportwebshop.model.Product;
import com.codecool.sportwebshop.model.ProductType;
import com.codecool.sportwebshop.service.ProductDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RouteController {

    @Autowired
    ProductDataManager productDataManager;

    @GetMapping("/all-product")
    List<Product> getAllProducts() {
        return productDataManager.getAllProducts();
    }

    @GetMapping("/product/{productType})")
    List<Product> getAllByProduct(@PathVariable("productType")ProductType type) {
        return productDataManager.getAllByProductType(type);
    }


}
