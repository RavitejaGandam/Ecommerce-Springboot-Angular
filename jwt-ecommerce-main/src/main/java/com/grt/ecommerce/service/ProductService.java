package com.grt.ecommerce.service;

import com.grt.ecommerce.dao.ProductDao;
import com.grt.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public Product addNewProduct(Product product){
        return productDao.save(product);
    }
}
