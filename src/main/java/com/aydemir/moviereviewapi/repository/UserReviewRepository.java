package com.aydemir.moviereviewapi.repository;

import com.aydemir.moviereviewapi.model.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserReviewRepository extends JpaRepository<UserReview, Long> {

    @Modifying
    @Query("Update UserReview u Set u.review=:review, u.rate=:rate where u.movieReviewId=:id")
    void updateReview(@Param("id") Long movieReviewId,@Param("review") String review,@Param("rate") int rate);
}
