package com.aydemir.moviereviewapi.controller;

import com.aydemir.moviereviewapi.model.Actor;
import com.aydemir.moviereviewapi.model.MovieActor;
import com.aydemir.moviereviewapi.service.ActorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/actor")
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @PostMapping
    public Actor saveActor(@RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }

    @GetMapping("/{actorId}")
    public Actor getActor(@PathVariable Long actorId) {
        return actorService.getActorById(actorId);
    }

    @PutMapping
    public Actor updateActor(@RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }

    @DeleteMapping("/{actorId}")
    public void removeActor(@PathVariable Long actorId) {
        actorService.deleteActorById(actorId);
    }

    @PostMapping("/movie")
    public MovieActor saveMovieActor(@RequestBody MovieActor movieActor) {
        return actorService.saveMovieActor(movieActor);
    }

    @DeleteMapping("/movie/{castingId}")
    public void deleteMovieActor(@PathVariable Long castingId) {
        actorService.deleteMovieActor(castingId);
    }

}
