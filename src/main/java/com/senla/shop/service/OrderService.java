package com.senla.shop.service;

import com.senla.shop.domain.Order;
import com.senla.shop.domain.Product;

public interface OrderService {
    Order saveOrder(Order order);

    Order getOrder(Integer id);
}
