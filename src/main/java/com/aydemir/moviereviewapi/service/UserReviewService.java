package com.aydemir.moviereviewapi.service;

import com.aydemir.moviereviewapi.model.UserReview;
import com.aydemir.moviereviewapi.repository.UserReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserReviewService {

    private final UserReviewRepository userReviewRepository;

    public UserReviewService(UserReviewRepository userReviewRepository) {
        this.userReviewRepository = userReviewRepository;
    }

    public UserReview saveReview(UserReview userReview) {
        return userReviewRepository.save(userReview);
    }

    public UserReview updateReview(Long movieReviewId, String review) {
        return null;
    }

    public UserReview updateRating(UserReview userReview) {
        return userReview;

    }

    public void deleteReview(Long reviewId) {
    }

    public Optional<UserReview> findById(Long reviewId) {
        return userReviewRepository.findById(reviewId);
    }

    public void updateReview(UserReview userReview) {
        userReviewRepository.updateReview(userReview.getMovieReviewId(),userReview.getReview(),userReview.getRate());
    }
}
