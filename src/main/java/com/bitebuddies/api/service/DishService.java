package com.bitebuddies.api.service;
import com.bitebuddies.api.entities.Dish;
import com.bitebuddies.api.entities.Dish;
import com.bitebuddies.api.repository.DishRepository;
import com.bitebuddies.api.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository){
        this.dishRepository = dishRepository;
    }

    public Iterable<Dish> list() {
        return dishRepository.findAll();
    }

    public Dish save(Dish dish) {
        return dishRepository.save(dish);
    }

    public void save(List<Dish> dishes) {
        dishRepository.saveAll(dishes);
    }
}
