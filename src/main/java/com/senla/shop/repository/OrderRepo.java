package com.senla.shop.repository;

import com.senla.shop.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
