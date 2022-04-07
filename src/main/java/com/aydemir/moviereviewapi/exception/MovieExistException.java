package com.aydemir.moviereviewapi.exception;

import com.aydemir.moviereviewapi.util.Constants;
import org.springframework.http.HttpStatus;

public class MovieExistException extends ApiException{

    public MovieExistException() {
        super(Constants.Error.MOVIE_EXISTS, HttpStatus.BAD_REQUEST,Constants.ErrorMessageKey.MOVIE_EXISTS);
    }
}
