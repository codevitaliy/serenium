package com.serenium.backend.meditation.entity;

import jakarta.persistence.*;
import java.time.Instant;

//We are creating the table inside the database with name maditations

@Entity
@Table(name = "meditations")
public class Meditation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 120)
  private String title;

  @Column(length = 1000)
  private String description;

  @Column(nullable = false)
  private Integer durationMinutes;

  @Column(length = 500)
  private String audioUrl;

  @Column(nullable = false, updatable = false)
  private Instant createdAt = Instant.now();



  protected Meditation() {
    // Required by JPA for entity instantiation
  };

  public Meditation(String title, String description, Integer durationMinutes, String audioUrl) {
    this.title = title;
    this.description = description;
    this.durationMinutes = durationMinutes;
    this.audioUrl = audioUrl;
  }

  public Long getId() { return id; }
  public String getTitle() { return title; }
  public String getDescription() { return description; }
  public Integer getDurationMinutes() { return durationMinutes; }
  public String getAudioUrl() { return audioUrl; }
  public Instant getCreatedAt() { return createdAt; }









}
