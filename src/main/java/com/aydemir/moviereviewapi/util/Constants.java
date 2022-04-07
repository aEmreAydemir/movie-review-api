package com.aydemir.moviereviewapi.util;

public interface Constants {
    interface Error {
        int USER_NOT_FOUND = 12000;
        int USER_EXISTS = 12001;
        int MOVIE_EXISTS = 13001;
        int MOVIE_NOT_FOUND = 13002;
        int LIST_EXISTS = 14000;
        int LIST_NOT_FOUND = 14001;
    }

    interface ErrorMessageKey {
        String USER_NOT_FOUND = "error.message.userNotFound";
        String USER_EXISTS = "error.message.userExists";
        String MOVIE_EXISTS = "error.message.movieExists";
        String MOVIE_NOT_FOUND = "error.message.movieNotFound";
        String LIST_EXISTS = "error.message.listExists";
        String LIST_NOT_FOUND = "error.message.listNotFound";
    }
}
