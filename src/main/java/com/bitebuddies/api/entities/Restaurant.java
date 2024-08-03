package com.bitebuddies.api.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Restaurant {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long rest_id;
    private String name;
    private String address;
    private int rating;
    private float longitude;
    private float latitude;


    public Restaurant() {

    }

}