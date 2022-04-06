package com.aydemir.moviereviewapi.util;

public interface Constants {
    interface Error {
        int USER_NOT_FOUND = 12000;
        int USER_EXISTS = 12001;
    }

    interface ErrorMessageKey {
        String USER_NOT_FOUND = "error.message.userNotFound";
        String USER_EXISTS = "error.message.userExists";
    }
}
