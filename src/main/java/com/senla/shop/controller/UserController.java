package com.senla.shop.controller;

import com.senla.shop.domain.User;
import com.senla.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @PostMapping
    @ResponseBody
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
