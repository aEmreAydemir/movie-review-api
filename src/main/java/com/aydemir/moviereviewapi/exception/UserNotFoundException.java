package com.aydemir.moviereviewapi.exception;

import com.aydemir.moviereviewapi.util.Constants;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends ApiException{

    public UserNotFoundException() {
        super(Constants.Error.USER_NOT_FOUND, HttpStatus.BAD_REQUEST,Constants.ErrorMessageKey.USER_NOT_FOUND);
    }

}
