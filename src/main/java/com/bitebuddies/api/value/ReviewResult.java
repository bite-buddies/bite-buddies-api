package com.bitebuddies.api.value;

import com.bitebuddies.api.entities.Dish;
import lombok.Value;

import java.util.List;

@Value
public class ReviewResult {
    String name;
    List<DishResult> dishList;

    public ReviewResult(String name, List<DishResult> dishList){
        this.name= name;
        this.dishList = dishList;
    }
}
