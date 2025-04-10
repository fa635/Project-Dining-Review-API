package com.fa.Project_Dining_Review_API.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

import com.fa.Project_Dining_Review_API.model.DiningReview;
import com.fa.Project_Dining_Review_API.model.User;


public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

}