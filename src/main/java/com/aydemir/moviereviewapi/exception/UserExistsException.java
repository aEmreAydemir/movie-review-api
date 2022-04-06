package com.aydemir.moviereviewapi.exception;

import com.aydemir.moviereviewapi.util.Constants;
import org.springframework.http.HttpStatus;

public class UserExistsException extends ApiException{

    public UserExistsException() {
        super(Constants.Error.USER_EXISTS,HttpStatus.BAD_REQUEST,Constants.ErrorMessageKey.USER_EXISTS);
    }

}
