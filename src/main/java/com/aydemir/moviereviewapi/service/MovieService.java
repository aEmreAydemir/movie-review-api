package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.exception.MovieNotFoundException;
import com.aydemir.moviereviewapi.model.Movie;
import com.aydemir.moviereviewapi.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getMoviesByTag(String tag) {
        return movieRepository.findByTagOrderByMovieNameAsc(tag);
    }

    public Movie getMovieById(Long movieId) {
        return movieRepository.findById(movieId).orElseThrow(MovieNotFoundException::new);
    }

    public void deleteMovieById(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public Optional<Movie> updateMovie(Movie movie) {
        movieRepository.updateMovie(movie.getMovieId(), movie.getMovieName(), movie.getTag(),movie.getReleaseYear());
        return movieRepository.findById(movie.getMovieId());
    }
}
