package com.fa.Project_Dining_Review_API.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class AdminReviewAction {
    private String adminName;
    private DiningReview review;
    private Boolean acceptsReview;
    
}
