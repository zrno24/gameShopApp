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
public class GameRepository {

private List<Game> games;

public List<Game> findAll() {
    return games;
}

public Game findById(int id) {
    return games.stream().filter(game -> game.getId() == id).findFirst().orElse(null);
}

}
