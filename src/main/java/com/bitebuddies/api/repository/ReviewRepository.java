package com.bitebuddies.api.repository;

import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.entities.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
