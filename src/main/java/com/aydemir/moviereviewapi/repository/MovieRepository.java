package com.aydemir.moviereviewapi.repository;

import com.aydemir.moviereviewapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface MovieRepository extends JpaRepository<Movie, Long>{

    @Query("Select m from Movie m where m.tag=:t")
    List<Movie> findByTag(@Param("t") String tag);

    @Modifying
    @Query("Update Movie m Set m.movieName=:name, m.tag=:tag, m.releaseYear=:year where m.movieId=:id")
    void updateMovie(@Param("id") Long movieId,@Param("name") String movieName,@Param("tag") String tag,@Param("year") int releaseYear);

    List<Movie> findByTagOrderByMovieNameAsc(String tag);
}
