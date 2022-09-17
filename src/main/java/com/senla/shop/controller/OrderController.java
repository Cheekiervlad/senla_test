package com.senla.shop.controller;

import com.senla.shop.domain.Order;
import com.senla.shop.domain.Product;
import com.senla.shop.service.OrderService;
import com.senla.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

//    @GetMapping("/{id}")
//    @ResponseBody
//    public Product getProduct(@PathVariable Integer id) {
//        return productService.getProduct(id);
//    }

    @PostMapping
    @ResponseBody
    public Order createProduct(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

}
