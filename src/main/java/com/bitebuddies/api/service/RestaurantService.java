package com.bitebuddies.api.service;

import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    public Iterable<Restaurant> list() {
        return restaurantRepository.findAll();
    }

    public Restaurant save(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public void save(List<Restaurant> restaurants) {
        restaurantRepository.saveAll(restaurants);
    }
}
