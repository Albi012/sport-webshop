package com.codecool.sportwebshop.repository;

import com.codecool.sportwebshop.model.Product;
import com.codecool.sportwebshop.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public List<Product> getAllByProductType(ProductType productType);

    public Product findByNameAndPriceAndProductType(String name,int price,ProductType productType);
}
