package com.game.gameshopapp.core.repository;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.model.User;
import com.game.gameshopapp.core.model.enums.UserType;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;
import java.util.Arrays;
import java.util.Optional;

@Repository
public interface GameRepository extends MongoRepository<Game, String>{

    @Aggregation(pipeline = """
{ $match: { _id: {$exists: true} } }
""")
    List<Game> findAllCustom();

    @Query(value="{genre: '?0'}", fields="{'id' : 1, 'title' = 1, 'genre' = 1, 'yearOfRelease' = 1, 'developerStudio' = 1, 'rating' = 1, 'price' = 1, 'publisher' = 1}")
    Optional<Game> findByGenreCustom(String genre);

    Optional<Game> findFirstByGenreLike(String genrePattern);

    List<Game> findAllByOrderByYearOfReleaseDesc();

    List<Game> findAllByOrderByYearOfReleaseAsc();





}
