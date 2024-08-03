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
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;


    public Restaurant() {}

}