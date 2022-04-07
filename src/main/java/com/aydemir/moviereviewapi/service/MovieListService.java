package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.dto.WatchlistDTO;
import com.aydemir.moviereviewapi.exception.ListNameExistException;
import com.aydemir.moviereviewapi.exception.ListNotFoundException;
import com.aydemir.moviereviewapi.exception.MovieExistException;
import com.aydemir.moviereviewapi.model.MovieList;
import com.aydemir.moviereviewapi.model.Watchlist;
import com.aydemir.moviereviewapi.repository.ListRepository;
import com.aydemir.moviereviewapi.repository.WatchlistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieListService {

    private final ListRepository listRepository;
    private final WatchlistRepository watchlistRepository;

    public MovieListService(ListRepository listRepository, WatchlistRepository watchlistRepository) {
        this.listRepository = listRepository;
        this.watchlistRepository = watchlistRepository;
    }

    public MovieList createList(MovieList movieList) {
        List<MovieList> movieLists = listRepository.findAllByOwnerId(movieList.getOwnerId());

        for (MovieList list : movieLists) {
            if (list.getListName().equals(movieList.getListName()))
                throw new ListNameExistException();
        }

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

    public Optional<MovieList> updateListName(Long listId,Long ownerId, String listName) {

        List<MovieList> movieLists = listRepository.findAllByOwnerId(ownerId);

        for (MovieList list : movieLists) {
            if (list.getListName().equals(listName))
                throw new ListNameExistException();
        }

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

        List<MovieList> list = listRepository.findByListNameContainingOrderByListNameAsc(searchParameter);

        if (list.isEmpty())
            throw new ListNotFoundException();

        return list;
    }

    public void deleteList(Long listId) {
        listRepository.deleteById(listId);
    }

    public void createWatchlist(Watchlist watchlist) {
        watchlistRepository.save(watchlist);
    }

    public WatchlistDTO addToWatchlist(Long userId, Long movieId) {
        Watchlist watchlist = watchlistRepository.findById(userId).orElseThrow(); //add exception here

       int index = watchlist.getMoviesToWatch().indexOf(movieId);

        if (index != -1)
            throw new MovieExistException();

        watchlist.getMoviesToWatch().add(movieId);
        watchlistRepository.save(watchlist);
        return null; //todo
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
