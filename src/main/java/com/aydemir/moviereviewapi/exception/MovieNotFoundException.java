package com.aydemir.moviereviewapi.exception;

import com.aydemir.moviereviewapi.util.Constants;
import org.springframework.http.HttpStatus;

public class MovieNotFoundException extends ApiException{

    public MovieNotFoundException() {
        super(Constants.Error.MOVIE_NOT_FOUND, HttpStatus.BAD_REQUEST,Constants.ErrorMessageKey.MOVIE_NOT_FOUND);
    }
}
