package com.aydemir.moviereviewapi.controller;

import com.aydemir.moviereviewapi.model.Movie;
import com.aydemir.moviereviewapi.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable Long movieId) {
        return movieService.getMovieById(movieId);
    }

    @PutMapping
    public Optional<Movie> updateMovie(@RequestBody Movie movie) {
        return movieService.updateMovie(movie);
    }

    @GetMapping("/{tag}/get-by-tag")
    public List<Movie> getMoviesByTag(@PathVariable String tag) {
        return movieService.getMoviesByTag(tag);
    }

    @DeleteMapping("/{movieId}")
    public void removeMovie(@PathVariable Long movieId) {
        movieService.deleteMovieById(movieId);
    }

}
