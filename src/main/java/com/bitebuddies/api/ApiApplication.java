package com.bitebuddies.api;

import com.bitebuddies.api.entities.Buddy;
import com.bitebuddies.api.entities.Dish;
import com.bitebuddies.api.entities.Review;
import com.bitebuddies.api.service.BuddyService;
import com.bitebuddies.api.service.DishService;
import com.bitebuddies.api.service.ReviewService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.bitebuddies.api.entities.Restaurant;
import com.bitebuddies.api.service.RestaurantService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	CommandLineRunner restaurantRunner(RestaurantService restaurantService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Restaurant>> typeReference = new TypeReference<>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/restaurants.json");
			try {
				List<Restaurant> restaurants = mapper.readValue(inputStream, typeReference);
				restaurantService.save(restaurants);
				System.out.println("Restaurants Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save restaurants: " + e.getMessage());
			}
		};
	}

	@Bean
	CommandLineRunner reviewRunner(ReviewService reviewService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Review>> typeReference = new TypeReference<>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/reviews.json");
			try {
				List<Review> reviews = mapper.readValue(inputStream, typeReference);
				reviewService.save(reviews);
				System.out.println("Reviews Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save reviews: " + e.getMessage());
			}
		};
	}

	@Bean
	CommandLineRunner buddyRunner(BuddyService buddyService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Buddy>> typeReference = new TypeReference<>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/buddies.json");
			try {
				List<Buddy> buddies = mapper.readValue(inputStream, typeReference);
				buddyService.save(buddies);
				System.out.println("Buddies Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save buddies: " + e.getMessage());
			}
		};
	}
	@Bean
	CommandLineRunner dishRunner(DishService dishService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Dish>> typeReference = new TypeReference<>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/dishes.json");
			try {
				List<Dish> dishes = mapper.readValue(inputStream, typeReference);
				dishService.save(dishes);
				System.out.println("Dishes Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save dishes: " + e.getMessage());
			}
		};
	}

}
