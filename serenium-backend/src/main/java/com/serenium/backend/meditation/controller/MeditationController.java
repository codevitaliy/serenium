package com.serenium.backend.meditation.controller;

import com.serenium.backend.meditation.entity.Meditation;
import com.serenium.backend.meditation.service.MeditationService;
import com.serenium.backend.meditation.repository.MeditationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Makes this class a REST controller (returns JSON responses)
@RequestMapping("/api/meditations") // endpoint path in this controller
public class MeditationController {

  private final MeditationService service;

  public MeditationController(MeditationService service) {
    this.service = service;
  }

  @GetMapping // Maps HTTP GET /api/meditaitions
  public List<Meditation> list() {
    return service.findAll();
  }

  @PostMapping // Maps HTTP POST /api/meditations //Este metodo se ejecuta cuando llega una petición HTTP POST
  public Meditation create(@RequestBody CreateMeditationRequest request) {

    return service.create(
            request.title(),
            request.description(),
            request.durationMinutes(),
            request.audioUrl()
    );
  }

  public record CreateMeditationRequest(
          String title, String description, Integer durationMinutes, String audioUrl) { }


}
