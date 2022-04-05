package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.model.Actor;
import com.aydemir.moviereviewapi.model.MovieActor;
import com.aydemir.moviereviewapi.repository.ActorRepository;
import com.aydemir.moviereviewapi.repository.MovieActorRepository;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    private final ActorRepository actorRepository;
    private final MovieActorRepository movieActorRepository;

    public ActorService(ActorRepository actorRepository, MovieActorRepository movieActorRepository) {
        this.actorRepository = actorRepository;
        this.movieActorRepository = movieActorRepository;
    }

    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    public Actor getActorById(Long actorId) {
        return actorRepository.getById(actorId);
    }

    public void deleteActorById(Long actorId) {
        actorRepository.deleteById(actorId);
    }

    public MovieActor saveMovieActor(MovieActor movieActor) {
        return movieActorRepository.save(movieActor);
    }

    public void deleteMovieActor(Long castingId) {
        movieActorRepository.deleteById(castingId);
    }
}
