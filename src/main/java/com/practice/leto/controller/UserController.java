package com.practice.leto.controller;

import com.practice.leto.dto.UserDto;
import com.practice.leto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserDto> getAlluser()
    {
        return userService.getAllUsers();
    }

    @PostMapping()
    public UserDto addUser(@RequestBody UserDto userDto)
    {
        return userService.createUser(userDto);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        userService.deleteUser(id);
    }
}
