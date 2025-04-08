package com.fa.Project_Dining_Review_API.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class AdminReviewAction {
    private ReviewStatus reviewStatus;

    public AdminReviewAction(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

}
