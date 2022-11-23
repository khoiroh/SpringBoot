package com.data.tokoonline.controller;

import com.data.tokoonline.model.User;
import com.data.tokoonline.repository.UserRepository;
import com.data.tokoonline.response.ResponseHelper;
import com.data.tokoonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping
    public Object addUser(@RequestBody User user)
    {return ResponseHelper.ok(userService.addUser(user));
    }

    @GetMapping("/{id}")
    public Object getUserById(@PathVariable("id") Long id)
    {return ResponseHelper.ok(userService.getUserById(id)) ;}

    @PutMapping("/{id}")
    public Object editUserById(@PathVariable("id") Long id, @RequestBody User user) {
        return ResponseHelper.ok(userService.editUserById(id, user.getUsername(), user.getEmail(), user.getAge(), user.getAddress(), user.getPhoneNumber())) ;
    }

    @GetMapping("/all")
    public Object getAllUser() {return ResponseHelper.ok(userService.getAllUser()) ;}

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {userService.deleteUserById(id);}
}
