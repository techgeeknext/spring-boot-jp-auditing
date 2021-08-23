package com.techgeeknext.service;

import com.techgeeknext.model.User;
import com.techgeeknext.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
       User added_user = userRepository.save(user);
        return added_user;
    }

    public Optional<User> getUserByUserId(int userId) {
        return userRepository.findById(userId);

    }

}
