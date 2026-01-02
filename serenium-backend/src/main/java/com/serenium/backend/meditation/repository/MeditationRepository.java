package com.serenium.backend.meditation.repository;

import com.serenium.backend.meditation.entity.Meditation;
import org.springframework.data.jpa.repository.JpaRepository;


// Spring Data JPA repository for accessing Meditation data \\ CRUD //
public interface MeditationRepository extends JpaRepository<Meditation, Long> {}

