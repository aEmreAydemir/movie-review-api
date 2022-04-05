package com.aydemir.moviereviewapi.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @NotNull
    private String movieName;

   /* @Nullable
    @ElementCollection
    private List<String> tags; */

    @Nullable
    private String tag;

    @Nullable
    private int releaseYear;
}
