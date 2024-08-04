package com.bitebuddies.api.controller;


import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.service.RestaurantService;
import com.bitebuddies.api.service.ReviewService;
import com.bitebuddies.api.value.ReviewResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private RestaurantService restaurantService;

    private ReviewService reviewService;


    public RestaurantController(RestaurantService restaurantService, ReviewService reviewService ) {
        this.restaurantService = restaurantService;
        this.reviewService = reviewService;
    }

    @GetMapping("/list")
    public Iterable<Restaurant> list() {
        return restaurantService.list();
    }

    @GetMapping("/{restaurantID}/reviews")
    public List<ReviewResult> list(@PathVariable String restaurantID) {

        Iterable<Restaurant> restaurants=restaurantService.list();
        List<ReviewResult> reviewResults = new ArrayList<>();
        ReviewResult reviewResult = new ReviewResult(restaurants.iterator().next().getName(), null);
        reviewResults.add(reviewResult);

        return reviewResults;
    }

}
