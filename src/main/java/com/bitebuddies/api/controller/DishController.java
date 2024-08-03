package com.bitebuddies.api.controller;


import com.bitebuddies.api.entities.Dish;
import com.bitebuddies.api.service.DishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dishes")
public class DishController {

    private DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/list")
    public Iterable<Dish> list() {
        return dishService.list();
    }
}
