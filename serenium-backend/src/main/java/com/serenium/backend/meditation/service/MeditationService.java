package com.serenium.backend.meditation.service;

import com.serenium.backend.meditation.entity.Meditation;
import com.serenium.backend.meditation.repository.MeditationRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MeditationService {

private final MeditationRepository repository;

public MeditationService(MeditationRepository repository) {
  this.repository = repository;
}

public Meditation create(String title, String description, Integer durationMinutes, String audioUrl) {
  return repository.save(new Meditation(title, description, durationMinutes, audioUrl));
}

public List<Meditation> findAll() {
  return repository.findAll();
}



}
