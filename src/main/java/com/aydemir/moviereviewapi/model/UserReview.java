package com.aydemir.moviereviewapi.model;


import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "movieReviews")
public class UserReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieReviewId;

    @NotNull
    private Long movieId;

    @NotNull
    private Long userId;

    @Nullable
    private String review;

    @Nullable
    private int rate;

    //private Date reviewDate = null;

    //@Nullable
    //private Date watchDate;
}
