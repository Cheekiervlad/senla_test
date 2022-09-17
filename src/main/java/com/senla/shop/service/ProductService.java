package com.senla.shop.service;

import com.senla.shop.domain.Product;

public interface ProductService {
    Product saveProduct(Product product);

    Product getProduct(Integer id);
}
