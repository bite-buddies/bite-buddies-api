package com.bitebuddies.api.service;
import com.bitebuddies.api.entities.Review;
import com.bitebuddies.api.entities.Review;
import com.bitebuddies.api.repository.ReviewRepository;
import com.bitebuddies.api.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public Iterable<Review> list() {
        return reviewRepository.findAll();
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void save(List<Review> reviews) {
        reviewRepository.saveAll(reviews);
    }
}
