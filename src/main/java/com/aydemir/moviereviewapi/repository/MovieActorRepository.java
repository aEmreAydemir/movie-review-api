package com.aydemir.moviereviewapi.repository;

import com.aydemir.moviereviewapi.model.MovieActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MovieActorRepository extends JpaRepository<MovieActor, Long> {
}
