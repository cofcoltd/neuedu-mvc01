package com.repository;

import com.domain.Emp;
import com.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void getProducts() {

        System.out.println(productRepository.getProducts());
    }

    @Test
    public void saveProduct() {

        Product product = new Product();
        product.setPname("xyz");
        product.setPrice(new BigDecimal(200));
        product.setDescription("一些描述");

        product =  productRepository.saveProduct(product);

        System.out.println("product : " + product);


    }
}