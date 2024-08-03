package com.bitebuddies.api.repository;

import com.bitebuddies.api.entities.Dish;
import com.bitebuddies.api.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish, Long> {

}
