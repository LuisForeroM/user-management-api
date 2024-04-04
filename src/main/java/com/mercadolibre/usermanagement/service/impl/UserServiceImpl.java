package com.mercadolibre.usermanagement.service.impl;

import com.mercadolibre.usermanagement.model.User;
import com.mercadolibre.usermanagement.repository.UserRepository;
import com.mercadolibre.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){

        this.userRepository = userRepository;

    }
    @Override
    public boolean saveUser(User user) {
        try{
            userRepository.save(user);
            return true;

        }catch (Exception e) {

            throw e;

        }

    }

    @Override
    public User getFirstUserByStatus(String userStatus) {
        return userRepository.findFirstByStatus(userStatus);
    }


    @Override
    public List<User> getUsersByStatus(String userStatus) {
        return userRepository.getUsersByStatus(userStatus);
    }
}
