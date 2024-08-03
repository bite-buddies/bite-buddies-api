package com.bitebuddies.api.controller;


import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/list")
    public Iterable<Restaurant> list() {
        return restaurantService.list();
    }
}
