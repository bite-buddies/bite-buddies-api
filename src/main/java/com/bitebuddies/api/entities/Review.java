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
    private Long review_id;
    private Long buddy_id;
    private Long rest_id;



    public Review() {

    }

}