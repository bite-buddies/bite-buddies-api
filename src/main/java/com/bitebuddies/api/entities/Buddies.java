package com.bitebuddies.api.entities;


import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Buddies {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String name;
    private String email;
    @OneToMany
    private ArrayList<Review> Reviews = new ArrayList<>();


    public Buddies() {

    }

}