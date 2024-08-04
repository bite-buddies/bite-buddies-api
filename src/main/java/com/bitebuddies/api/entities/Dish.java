package com.bitebuddies.api.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Dish {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long dish_id;
    private String dish_name;
    private int rating;
    private Long review_id;


    public Dish() {

    }

}