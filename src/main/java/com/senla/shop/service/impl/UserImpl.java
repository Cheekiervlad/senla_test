package com.senla.shop.service.impl;

import com.senla.shop.domain.User;
import com.senla.shop.repository.UserRepo;
import com.senla.shop.service.UserService;
import com.senla.shop.util.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return userRepo.findById(id)
                .orElseThrow(()-> new UserNotFoundException(String.format("User with id %s not found", id)));
    }
}
