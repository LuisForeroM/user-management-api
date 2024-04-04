package com.mercadolibre.usermanagement.service;

import com.mercadolibre.usermanagement.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersByStatus(String userStatus);

    boolean saveUser(User user);

    User getFirstUserByStatus(String userStatus);
}
