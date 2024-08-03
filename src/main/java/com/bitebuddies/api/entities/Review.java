package com.bitebuddies.api.entities;


import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @ManyToOne
    private Buddies buddies;
    @OneToMany
    private ArrayList<Dish> Dishes = new ArrayList<>();


    public Review() {

    }

}