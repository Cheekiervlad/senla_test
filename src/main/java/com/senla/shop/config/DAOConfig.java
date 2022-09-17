package com.senla.shop.config;

import com.senla.shop.domain.Order;
import com.senla.shop.domain.Product;
import com.senla.shop.domain.ProductStatus;
import com.senla.shop.domain.User;
import com.senla.shop.repository.OrderRepo;
import com.senla.shop.repository.ProductRepo;
import com.senla.shop.repository.UserRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class DAOConfig {
    @Bean
    public ApplicationRunner dataLoader(ProductRepo repo, UserRepo userRepo, OrderRepo orderRepo){
        return args -> {
            repo.save(new Product("Bureger", new BigDecimal(5), ProductStatus.IN_STOCK));
            repo.save(new Product("Pizza", new BigDecimal(7), ProductStatus.IN_STOCK));
            repo.save(new Product("Cola", new BigDecimal(8), ProductStatus.IN_STOCK));
            repo.save(new Product("Sprite", new BigDecimal(1), ProductStatus.IN_STOCK));

            userRepo.save(new User("Anton"));

//            orderRepo.save(new Order());
        };
    }
}
