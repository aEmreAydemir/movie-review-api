package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.model.MovieList;
import com.aydemir.moviereviewapi.model.User;
import com.aydemir.moviereviewapi.repository.ListRepository;
import com.aydemir.moviereviewapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ListRepository listRepository;

    public UserService(UserRepository userRepository, ListRepository listRepository) {
        this.userRepository = userRepository;
        this.listRepository = listRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.getById(userId);
    }

    //todo user updates

    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

}
