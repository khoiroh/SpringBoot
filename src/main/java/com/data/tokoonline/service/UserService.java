package com.data.tokoonline.service;

import com.data.tokoonline.model.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    Object getUserById(Long id);

   Object getAllUser();
    User editUserById(Long id, String username, String email, Integer age, String address, Integer phoneNumber);

    void deleteUserById(Long id);
}
