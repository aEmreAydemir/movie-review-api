package com.aydemir.moviereviewapi.exception;

import com.aydemir.moviereviewapi.util.Constants;
import org.springframework.http.HttpStatus;

public class ListNameExistException extends ApiException{

    public ListNameExistException() {
        super(Constants.Error.LIST_EXISTS, HttpStatus.BAD_REQUEST,Constants.ErrorMessageKey.LIST_EXISTS);
    }
}
