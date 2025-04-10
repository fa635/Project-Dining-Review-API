package com.fa.Project_Dining_Review_API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.persistence.EnumType;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "DININGREVIEW")
public class DiningReview {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "REVIEWER_ID", nullable = false)
    private User reviewer;

    @Column(name = "RESTAURANT")
    private Long restaurantId;

    @Min(1)
    @Max(5)
    @Column(name = "REVIEWERPEANUTSCORE", nullable = true)
    private Float peanutScore;
  
    @Min(1)
    @Max(5)
    @Column(name = "REVIEWEREGGSCORE", nullable = true)
    private Float eggScore;

    @Min(1)
    @Max(5)
    @Column(name = "REVIEWERDAIRYSCORE", nullable = true)
    private Float dairyScore;

    @Column(name = "COMMENTARY", nullable = true)
    private String comentary;

    @Enumerated(EnumType.STRING)
    @Column(name = "REVIEW_STATUS")
    private ReviewStatus reviewStatus = ReviewStatus.PENDING;
    
    public void processAdminAction(AdminReviewAction action) {
        this.reviewStatus = action.getReviewStatus();
    }
}

