package com.codecool.sportwebshop.service;

import com.codecool.sportwebshop.model.Product;
import com.codecool.sportwebshop.model.ProductDataFromRequest;
import com.codecool.sportwebshop.model.ProductType;
import com.codecool.sportwebshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDataManager {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getAllByProductType(ProductType type) {
        return productRepository.getAllByProductType(type);
    }

    public boolean saveNewProduct(ProductDataFromRequest productDataFromRequest) {
        if(checkIfProductExist(productDataFromRequest)){
            return false;
        }
        else {
            Product product = Product.builder()
                    .name(productDataFromRequest.getName())
                    .price(productDataFromRequest.getPrice())
                    .productType(productDataFromRequest.getProductType())
                    .size(productDataFromRequest.getSize())
                    .imgSrc(productDataFromRequest.getImgSrc())
                    .build();
            productRepository.saveAndFlush(product);
            return true;
        }
    }

    private boolean checkIfProductExist(ProductDataFromRequest productDataFromRequest) {
        Product product = productRepository.findByNameAndPriceAndProductType(productDataFromRequest.getName(), productDataFromRequest.getPrice(), productDataFromRequest.getProductType());
        return product != null;
    }
}
