package com.aydemir.moviereviewapi.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "movieActors")
public class MovieActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long castingId;

    @NotNull
    private Long movieId;

    @NotNull
    private Long actorId;
}
