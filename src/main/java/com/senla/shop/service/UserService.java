package com.senla.shop.service;

import com.senla.shop.domain.User;

public interface UserService {
    User saveUser(User user);

    User getUser(Integer id);
}
