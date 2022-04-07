package com.aydemir.moviereviewapi.controller;

import com.aydemir.moviereviewapi.dto.WatchlistDTO;
import com.aydemir.moviereviewapi.model.MovieList;
import com.aydemir.moviereviewapi.service.MovieListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movie-list")
public class MovieListController {

    private final MovieListService movieListService;

    public MovieListController(MovieListService movieListService) {
        this.movieListService = movieListService;
    }

    //create special Movie list
    @PostMapping("/list")
    public MovieList createList(@RequestBody MovieList movieList) {
        return movieListService.createList(movieList);
    }

    //add movie to special Movie list
    @PutMapping("/list/add-movie/{listId}/{movieId}")
    public MovieList addMovieToList(@PathVariable Long listId, @PathVariable Long movieId) {
        return movieListService.addMovieToList(listId,movieId);
    }
    //get movie list info
    @GetMapping("/list/{listId}")
    public Optional<MovieList> getMovieList(@PathVariable Long listId) {
        return movieListService.getMovieList(listId);
    }
    //update movie list name
    @PutMapping("/list/{listId}/{ownerId}/{listName}/update-name/")
    public Optional<MovieList> updateListName(@PathVariable Long listId,@PathVariable Long ownerId, @PathVariable String listName) {
        return movieListService.updateListName(listId,ownerId,listName);
    }

    @PutMapping("/list/update-description/{listId}/{listName}")
    public Optional<MovieList> updateListDescription(@PathVariable Long listId, @PathVariable String description) {
        return movieListService.updateListDescription(listId,description);
    }

    //update movie list to public
    @PutMapping("/list/set-publicity/{listId}")
    public Optional<MovieList> setListPrivacy(@PathVariable Long listId, @RequestParam boolean isPublic) {
        return movieListService.setListPrivacy(listId,isPublic);
    }

    @PutMapping("/list/remove-movie/{listId}/{movieId}")
    public MovieList removeMovieFromList(@PathVariable Long listId, @PathVariable Long movieId) {
        return movieListService.removeMovieFromList(listId,movieId);
    }

    @GetMapping("list/search-list/{search}")
    public List<MovieList> searchMovieLists(@PathVariable String search) {
        return movieListService.searchList(search);
    }

    //delete movie list
    @DeleteMapping("/list/{listId}")
    public void deleteList(@PathVariable Long listId) {
        movieListService.deleteList(listId);
    }
    ///

    //add movie to watchlist
    @PostMapping("/watchlist/{userId}/{movieId}")
    public WatchlistDTO addToWatchlist(@PathVariable Long userId, @PathVariable Long movieId) {
        return movieListService.addToWatchlist(userId,movieId);
    }

    //get watchlist
    @GetMapping("/watchlist/{userId}")
    public WatchlistDTO getWatchlist(@PathVariable Long userId) {
        return movieListService.getWatchlist(userId);
    }

    //remove movie from watchlist
    @DeleteMapping("/watchlist/{userId}/{movieId}")
    public WatchlistDTO removeFromWatchlist(@PathVariable Long userId, @PathVariable Long movieId) {
        return movieListService.removeFromWatchlist(userId,movieId);
    }
    ///

    //add movie to watched movie list
    @PostMapping("/watchedList/{userId}/{movieId}")
    public WatchlistDTO addToWatchedlist(@PathVariable Long userId, @PathVariable Long movieId) {
        return movieListService.addToWatchedList(userId,movieId);
    }

    //get watchedList
    @GetMapping("/watchedList/{userId}")
    public WatchlistDTO getWatchedList(@PathVariable Long userId) {
        return movieListService.getWatchedList(userId);
    }

    //remove movie from watchlist
    @DeleteMapping("/watchedList/{userId}/{movieId}")
    public WatchlistDTO removeFromWatchedList(@PathVariable Long userId, @PathVariable Long movieId) {
        return movieListService.removeFromWatchedList(userId,movieId);
    }
}
