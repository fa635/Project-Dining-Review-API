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
@Table(name = "RESATAURANTS")
public class Restaurant {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "RESATAURANTNAME")
    private String name;

    @Column(name = "RESATAURANTPEANUTSCORE")
    private Float peanutScore;
  
    @Column(name = "RESATAURANTEGGSCORE")
    private Float eggScore;

    @Column(name = "RESATAURANTDAIRYSCORE")
    private Float dairyScore;

    @Column(name = "RESATAURANTOVERALLSCORE")
    private Float overallScore;

}
