package com.bitebuddies.api.controller;


import com.bitebuddies.api.entities.Dish;
import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.entities.Review;
import com.bitebuddies.api.service.BuddyService;
import com.bitebuddies.api.service.DishService;
import com.bitebuddies.api.service.RestaurantService;
import com.bitebuddies.api.service.ReviewService;
import com.bitebuddies.api.value.DishResult;
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

    private BuddyService buddyService;

    private DishService dishService;


    public RestaurantController(RestaurantService restaurantService, ReviewService reviewService, BuddyService buddyService, DishService dishService) {
        this.restaurantService = restaurantService;
        this.reviewService = reviewService;
        this.buddyService = buddyService;
        this.dishService = dishService;
    }

    @GetMapping("/list")
    public Iterable<Restaurant> list() {
        return restaurantService.list();
    }

    @GetMapping("/{restaurantID}/reviews")
    public List<ReviewResult> list(@PathVariable String restaurantID) {

        Iterable<Restaurant> restaurants=restaurantService.list();
        Iterable<Review> reviews = reviewService.list();
        Iterable<Dish> dishes = dishService.list();
        List<ReviewResult> reviewResults = new ArrayList<>();


        Long restLongValue= Long.parseLong(restaurantID);

        for (Restaurant restaurant : restaurants) {
            if(restaurant.getRest_id().equals(restLongValue)){
                String buddyName=null;
                List<DishResult> dishResults= new ArrayList<>();
                for (Review review : reviews) {
                    if(review.getRest_id().equals(restLongValue)){
                        buddyName = buddyService.findById(review.getBuddy_id()).get().getName();

                        dishes.forEach(dish -> {
                            if(dish.getReview_id().equals(review.getReview_id())){
                                DishResult dishResult= new DishResult(dish.getDish_name(),dish.getRating());
                                dishResults.add(dishResult);
                            }

                        });


                    }
                }


                ReviewResult reviewResult = new ReviewResult(buddyName, dishResults);
                reviewResults.add(reviewResult);
            }
        }

        return reviewResults;
    }

}
