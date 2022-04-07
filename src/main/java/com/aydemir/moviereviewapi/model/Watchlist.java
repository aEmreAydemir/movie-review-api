package com.aydemir.moviereviewapi.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "watchlist")
public class Watchlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @ElementCollection
    private List<Long> watchedMovieIds = new ArrayList<>();

    //@ElementCollection(targetClass=Long.class)
    @ElementCollection
    private List<Long> moviesToWatch = new ArrayList<>();
}
