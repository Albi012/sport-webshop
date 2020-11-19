package com.codecool.sportwebshop.controller;

import com.codecool.sportwebshop.model.Product;
import com.codecool.sportwebshop.model.ProductDataFromRequest;
import com.codecool.sportwebshop.model.ProductType;
import com.codecool.sportwebshop.service.ProductDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product/{type}")
    List<Product> getAllByProduct(@PathVariable("type") String type) {
        return productDataManager.getAllByProductType(ProductType.valueOf(type.toUpperCase()));
    }

    @PostMapping("/upload-product")
    boolean uploadNewProduct(@RequestBody ProductDataFromRequest productDataFromRequest){
        return productDataManager.saveNewProduct(productDataFromRequest);
    }


}
