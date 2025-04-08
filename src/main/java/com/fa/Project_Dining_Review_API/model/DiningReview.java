package com.fa.Project_Dining_Review_API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "DININGREVIEW")
public class DiningReview {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "REVIEWER", unique = true)
    private String reviewer;

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

}

