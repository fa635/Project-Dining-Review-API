package com.fa.Project_Dining_Review_API.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.fa.Project_Dining_Review_API.model.*;


public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

    /*As an admin, I want to get the list of all dining reviews that are pending approval. */
    List<DiningReview> findByReviewStatus(ReviewStatus reviewStatus);
    default List<DiningReview> findByReviewPending() {
        return findByReviewStatus(ReviewStatus.PENDING);
    }
    
    List<DiningReview> findByRestaurantAndReviewStatus(Restaurant restaurant, ReviewStatus reviewStatus);
    default List<DiningReview> findByRestaurantAndReviewApproved(Restaurant restaurant) {
        return findByRestaurantAndReviewStatus(restaurant, ReviewStatus.APPROVED);
    }
    /*As part of the backend process that updates a restaurant’s set of scores, 
    I want to fetch the set of all approved dining reviews belonging to this restaurant. */


    
}