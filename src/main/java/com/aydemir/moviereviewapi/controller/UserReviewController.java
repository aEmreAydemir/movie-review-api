package com.aydemir.moviereviewapi.controller;

import com.aydemir.moviereviewapi.model.UserReview;
import com.aydemir.moviereviewapi.repository.UserReviewRepository;
import com.aydemir.moviereviewapi.service.UserReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/review")
public class UserReviewController {

    private final UserReviewService userReviewService;
    public UserReviewController(UserReviewService userReviewService) {
        this.userReviewService = userReviewService;
    }

    @PostMapping
    public UserReview save(@RequestBody UserReview userReview) {
        return userReviewService.saveReview(userReview);
    }

    @GetMapping("/{reviewId}")
    public Optional<UserReview> getReview(@PathVariable Long reviewId) {
        return userReviewService.findById(reviewId);
    }

    @PutMapping
    public void updateReview(@RequestBody UserReview userReview) {
        userReviewService.updateReview(userReview);
    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        userReviewService.deleteReview(reviewId);
    }
}
