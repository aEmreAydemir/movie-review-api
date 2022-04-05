package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.dto.WatchlistDTO;
import com.aydemir.moviereviewapi.model.MovieList;
import com.aydemir.moviereviewapi.repository.ListRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieListService {

    private final ListRepository listRepository;

    public MovieListService(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    public MovieList createList(MovieList movieList) {
        return listRepository.save(movieList);
    }

    public MovieList addMovieToList(Long listId, Long movieId) {
        return null;
    }

    public MovieList getMovieList(Long listId) {
        return null;

    }

    public MovieList updateListName(Long listId, String listName) {
        return null;
    }

    public MovieList setListToPrivate(Long listId) {
        return null;
    }

    public MovieList setListToPublic(Long listId) {
        return null;
    }

    public MovieList removeMovieFromList(Long listId, Long movieId) {
        return null;
    }

    public void deleteList(Long listId) {
    }

    public WatchlistDTO addToWatchlist(Long userId, Long movieId) {
        return null;
    }

    public WatchlistDTO getWatchlist(Long userId) {
        return null;
    }

    public WatchlistDTO removeFromWatchlist(Long userId, Long movieId) {
        return null;
    }

    public WatchlistDTO addToWatchedList(Long userId, Long movieId) {
        return null;
    }

    public WatchlistDTO getWatchedList(Long userId) {
        return null;
    }

    public WatchlistDTO removeFromWatchedList(Long userId, Long movieId) {
        return null;
    }
}
