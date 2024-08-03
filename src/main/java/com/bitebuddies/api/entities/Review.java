package main.java.com.bitebuddies.api.entities;


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
    private Buddies User;
    private ArrayList<Dish> Dishes = new ArrayList<>();


    public Review() {

    }

}