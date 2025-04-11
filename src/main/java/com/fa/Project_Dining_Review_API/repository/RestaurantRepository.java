package com.fa.Project_Dining_Review_API.repository;

import org.springframework.data.repository.CrudRepository;

import com.fa.Project_Dining_Review_API.model.Restaurant;


public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}