package com.aydemir.moviereviewapi.repository;

import com.aydemir.moviereviewapi.model.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistRepository extends JpaRepository<Watchlist, Long> { }
