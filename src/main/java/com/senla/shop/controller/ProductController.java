package com.senla.shop.controller;

import com.senla.shop.domain.Product;
import com.senla.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    @ResponseBody
    public Product getProduct(@PathVariable Integer id) {
        return productService.getProduct(id);
    }

    @PostMapping
    @ResponseBody
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
