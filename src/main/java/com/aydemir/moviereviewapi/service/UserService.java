package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.exception.UserExistsException;
import com.aydemir.moviereviewapi.exception.UserNotFoundException;
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
        User existingUser = userRepository.findByUserName(user.getUserName());

        if (existingUser != null)
            throw new UserExistsException();

        existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser != null)
            throw new UserExistsException();

        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    //todo user updates

    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

}
