package com.bitebuddies.api.controller;


import com.bitebuddies.api.entities.Buddy;
import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.service.BuddyService;
import com.bitebuddies.api.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buddies")
public class BuddyController {

    private BuddyService buddyService;

    public BuddyController(BuddyService buddyService) {
        this.buddyService = buddyService;
    }

    @GetMapping("/list")
    public Iterable<Buddy> list() {
        return buddyService.list();
    }
}
