package com.aydemir.moviereviewapi.model;


import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "movieLists")
public class MovieList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;

    @NotNull
    private Long ownerId;

    @NotNull
    private String listName;

    @NotNull
    private boolean isPublic = false;

//  @ElementCollection(targetClass=Long.class)
    @Nullable
    @ElementCollection
    private List<Long> movies;
}
