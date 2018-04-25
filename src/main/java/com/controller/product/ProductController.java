package com.controller.product;

import com.domain.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }


    @PostMapping
    public Product saveProduct(Product product) {
        return productRepository.saveProduct(product);
    }


}
