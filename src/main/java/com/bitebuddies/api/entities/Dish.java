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
    private String name;
    private int rating;


    public Dish() {

    }

}