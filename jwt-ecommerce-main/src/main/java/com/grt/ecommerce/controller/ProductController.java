package com.grt.ecommerce.controller;

import com.grt.ecommerce.entity.Product;
import com.grt.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product/add")
    public Product addNewProduct(@RequestBody Product product){
        return productService.addNewProduct(product);
    }
}
