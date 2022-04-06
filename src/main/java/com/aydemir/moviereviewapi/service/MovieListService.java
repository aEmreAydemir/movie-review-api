package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.dto.WatchlistDTO;
import com.aydemir.moviereviewapi.model.MovieList;
import com.aydemir.moviereviewapi.repository.ListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        MovieList movieList = listRepository.findById(listId).get();
        movieList.getMovies().add(movieId);
        return listRepository.save(movieList);
    }

    public Optional<MovieList> getMovieList(Long listId) {
        return listRepository.findById(listId);
    }

    public Optional<MovieList> updateListName(Long listId, String listName) {
        listRepository.updateListName(listId,listName);
        return listRepository.findById(listId);
    }

    public Optional<MovieList> updateListDescription(Long listId, String description) {
        listRepository.updateListDescription(listId,description);
        return listRepository.findById(listId);
    }

    public Optional<MovieList> setListPrivacy(Long listId, boolean isPublic) {
        listRepository.updateListPublicity(listId,isPublic);
        return listRepository.findById(listId);
    }

    public MovieList removeMovieFromList(Long listId, Long movieId) {
        MovieList movieList = listRepository.findById(listId).get();
        movieList.getMovies().remove(movieId);
        return listRepository.save(movieList);
    }

    public List<MovieList> searchList(String searchParameter) {
        return listRepository.findByListNameContainingOrderByListNameAsc(searchParameter);
    }

    public void deleteList(Long listId) {
        listRepository.deleteById(listId);
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
