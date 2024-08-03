package com.bitebuddies.api.entities;


import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Buddy {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long buddy_id;
    private String name;


    public Buddy() {

    }

}