package com.example.demo.repository;


import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByProductName(String productName);
    Product findByProductCategory(String productCategory);
    Product findByProductRating(Double productRating);

    interface ProductService {
        List<Product> getAllProducts();
        Product getProductById(int id);
        Product saveProduct(Product product);
        Product updateProduct(int id, Product product);
        void deleteProduct(int id);

        Product getProductByProductName(String productName);
        Product getProductByCategory(String category);
        Product getProductByRating(Double rating);
    }
}
