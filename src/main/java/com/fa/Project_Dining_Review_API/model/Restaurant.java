package com.fa.Project_Dining_Review_API.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RESTAURANT_NAME", unique = true)
    private String name;

    @Column(name = "RESTAURANT_PEANUT_SCORE", nullable = true)
    private Float peanutScore;
  
    @Column(name = "RESTAURANT_EGG_SCORE", nullable = true)
    private Float eggScore;

    @Column(name = "RESTAURANT_DAIRY_SCORE", nullable = true)
    private Float dairyScore;

    @Column(name = "RESTAURANT_OVERALL_SCORE")
    private Float overallScore;

}
