package com.aydemir.moviereviewapi.exception;

import com.aydemir.moviereviewapi.util.Constants;
import org.springframework.http.HttpStatus;

public class ListNotFoundException extends ApiException{

    public ListNotFoundException() {
        super(Constants.Error.LIST_NOT_FOUND, HttpStatus.BAD_REQUEST,Constants.ErrorMessageKey.LIST_NOT_FOUND);
    }
}
