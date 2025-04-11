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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fa.Project_Dining_Review_API.model.*;

import com.fa.Project_Dining_Review_API.repository.DiningReviewRepository;

@RestController
@RequestMapping("/dining-review")
public class DiningReviewController {

    private final DiningReviewRepository diningReviewRepository;

    public DiningReviewController(DiningReviewRepository diningReviewRepository) {
        this.diningReviewRepository = diningReviewRepository;
    }

    @PostMapping
    public DiningReview createDiningReview (@RequestBody DiningReview diningReview) {
        return this.diningReviewRepository.save(diningReview);
    }

    @GetMapping("/pending")
    public List<DiningReview> getPendingReviews() {
        return this.diningReviewRepository.findByReviewPending();
    }


    @PutMapping("/{id}/{updatedStatus}")
    public DiningReview updateReviewStatus(@PathVariable Long id, @PathVariable String updatedStatus) {
        Optional<DiningReview> diningReviewOptional = this.diningReviewRepository.findById(id);
        if (!diningReviewOptional.isPresent()) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid id.");
        }

        ReviewStatus status = ReviewStatus.valueOf(updatedStatus);
    
        DiningReview idDiningReview = diningReviewOptional.get();
        idDiningReview.setReviewStatus(status);
        
        this.diningReviewRepository.save(idDiningReview);

        return idDiningReview;
    }

    
}

//mvn spring-boot:run

