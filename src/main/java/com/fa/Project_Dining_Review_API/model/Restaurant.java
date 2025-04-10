package com.fa.Project_Dining_Review_API.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RESTAURANTS")
public class Restaurant {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "RESATAURANT_NAME")
    private String name;

    @Column(name = "RESATAURANT_PEANUT_SCORE")
    private Float peanutScore;
  
    @Column(name = "RESATAURANT_EGG_SCORE")
    private Float eggScore;

    @Column(name = "RESATAURANT_DAIRY_SCORE")
    private Float dairyScore;

    @Column(name = "RESATAURANT_OVERALL_SCORE")
    private Float overallScore;

}
