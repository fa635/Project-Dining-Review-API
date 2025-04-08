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
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USERNAME", nullable = true)
    private String username;

    @Column(name = "CITY")
    private String city;
  
    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP_CODE")
    private Integer zipCode;

    @Column(name = "IS_INTERESTED_IN_PEANUT_ALLERGIES")
    private Boolean isInterestedInPeanutAllergies;

    @Column(name = "IS_INTERESTED_IN_EGG_ALLERGIES")
    private Boolean isInterestedInEggAllergies;

    @Column(name = "IS_INTERESTED_IN_DAIRY_ALLERGIES")
    private Boolean isInterestedInDairyAllergies;
    
}
