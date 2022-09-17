package com.senla.shop.service.impl;

import com.senla.shop.domain.Order;
import com.senla.shop.domain.Product;
import com.senla.shop.repository.OrderRepo;
import com.senla.shop.repository.ProductRepo;
import com.senla.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderImpl implements OrderService {
    private final OrderRepo orderRepo;
    @Override
    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public Order getOrder(Integer id) {
        return null;
    }
}
