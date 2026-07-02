package com.practice.leto.controller;

import com.practice.leto.dto.UserDto;
import com.practice.leto.repository.UserRepository;
import com.practice.leto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()


    @PostMapping()
    public UserDto addUser(@RequestBody UserDto userDto)
    {

    }

    @DeleteMapping()

}
