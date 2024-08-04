package com.bitebuddies.api.value;

import lombok.Value;

@Value
public class DishResult {
    String dishName;
    int rating;

    public DishResult(String dishName, int rating){
        this.dishName= dishName;
        this.rating=rating;
    }
}
