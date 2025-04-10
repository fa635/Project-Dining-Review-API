package com.fa.Project_Dining_Review_API.controller;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fa.Project_Dining_Review_API.model.*;

import com.fa.Project_Dining_Review_API.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    // User 
    @PostMapping
    public User createUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        Optional<User> userOptional = this.userRepository.findById(id);
        if (!userOptional.isPresent()) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid id.");
        }
    
        User idUser = userOptional.get();
        idUser.setCity(user.getCity());
        idUser.setZipCode(user.getZipCode());
        idUser.setState(user.getState());
        idUser.setIsInterestedInPeanutAllergies(user.getIsInterestedInPeanutAllergies());
        idUser.setIsInterestedInEggAllergies(user.getIsInterestedInEggAllergies());
        idUser.setIsInterestedInDairyAllergies(user.getIsInterestedInDairyAllergies());

        this.userRepository.save(idUser);

        return idUser;
    }

    @GetMapping("/{username}")
	public User getUserByName(@PathVariable String username) {

        Optional<User> userOptional = this.userRepository.findByUsername(username);
    
        if (!userOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found with username: " + username);
        }
        
        return userOptional.get();
	}
    
}


//mvn spring-boot:run