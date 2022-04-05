package com.aydemir.moviereviewapi.repository;

import com.aydemir.moviereviewapi.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
