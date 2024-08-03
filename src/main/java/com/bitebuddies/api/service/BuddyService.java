package com.bitebuddies.api.service;
import com.bitebuddies.api.entities.Buddy;
import com.bitebuddies.api.entities.Buddy;
import com.bitebuddies.api.repository.BuddyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuddyService {

    private final BuddyRepository buddyRepository;

    public BuddyService(BuddyRepository buddyRepository){
        this.buddyRepository = buddyRepository;
    }

    public Iterable<Buddy> list() {
        return buddyRepository.findAll();
    }

    public Buddy save(Buddy buddy) {
        return buddyRepository.save(buddy);
    }

    public void save(List<Buddy> buddies) {
        buddyRepository.saveAll(buddies);
    }
}
