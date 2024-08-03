package com.bitebuddies.api.repository;

import com.bitebuddies.api.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
