package com.bitebuddies.api.controller;


import com.bitebuddies.api.entities.Review;
import com.bitebuddies.api.entities.Review;
import com.bitebuddies.api.service.ReviewService;
import com.bitebuddies.api.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/list")
    public Iterable<Review> list() {
        return reviewService.list();
    }
}
