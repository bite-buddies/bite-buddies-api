package com.bitebuddies.api.repository;

import com.bitebuddies.api.entities.Buddy;
import com.bitebuddies.api.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface BuddyRepository extends CrudRepository<Buddy, Long> {

}
