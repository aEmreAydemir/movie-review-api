package com.aydemir.moviereviewapi.repository;

import com.aydemir.moviereviewapi.model.Movie;
import com.aydemir.moviereviewapi.model.MovieList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ListRepository extends JpaRepository<MovieList, Long> {

    @Modifying
    @Query("Update MovieList ml Set ml.listName=:name where ml.listId=:id")
    void updateListName(@Param("id") Long movieListId, @Param("name") String listName);

    @Modifying
    @Query("Update MovieList ml Set ml.description=:description where ml.listId=:id")
    void updateListDescription(@Param("id") Long listId, @Param("description") String description);


    @Modifying
    @Query("Update MovieList ml Set ml.isPublic=:isPublic where ml.listId=:id")
    void updateListPublicity(@Param("id") Long listId, @Param("isPublic") boolean isPublic);

    List<MovieList> findByListNameContainingOrderByListNameAsc(String listName);

    List<MovieList> findAllByOwnerId(Long ownerId);
}
