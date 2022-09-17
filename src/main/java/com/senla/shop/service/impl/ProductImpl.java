package com.senla.shop.service.impl;

import com.senla.shop.domain.Product;
import com.senla.shop.repository.ProductRepo;
import com.senla.shop.repository.UserRepo;
import com.senla.shop.service.ProductService;
import com.senla.shop.util.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {
    private final ProductRepo productRepo;
    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepo.findById(id)
                .orElseThrow(()-> new ProductNotFoundException(" Product not found"));
    }
}
