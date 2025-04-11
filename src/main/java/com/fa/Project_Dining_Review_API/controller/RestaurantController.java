package com.fa.Project_Dining_Review_API.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fa.Project_Dining_Review_API.model.*;

import com.fa.Project_Dining_Review_API.repository.*;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;
    private final DiningReviewRepository diningReviewRepository;

    public RestaurantController(RestaurantRepository restaurantRepository, DiningReviewRepository diningReviewRepository) {
        this.restaurantRepository = restaurantRepository;
        this.diningReviewRepository = diningReviewRepository;
    }

    @PostMapping
    public Restaurant createRestaurant (@RequestBody Restaurant restaurant) {
        return this.restaurantRepository.save(restaurant);
    }

    @GetMapping("approved-reviews/{restaurantID}")
	public List<DiningReview> getRestaurantApprovedReviews(@PathVariable Long restaurantID) {

        Optional<Restaurant> restaurantOptional = this.restaurantRepository.findById(restaurantID);
        if (!restaurantOptional.isPresent()) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid id.");
        }
    
        Restaurant idRestaurant = restaurantOptional.get();

        return this.diningReviewRepository.findByRestaurantAndReviewApproved(idRestaurant);
	}


    @GetMapping("/{restaurantID}")
	public Restaurant getRestaurantByName(@PathVariable Long restaurantID) {

        Optional<Restaurant> restaurantOptional = this.restaurantRepository.findById(restaurantID);
    
        if (!restaurantOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Restaurant not found with username: " + restaurantID);
        }
        
        return restaurantOptional.get();
	}
}


//mvn spring-boot:run