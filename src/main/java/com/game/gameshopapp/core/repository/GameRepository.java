package com.game.gameshopapp.core.repository;

import com.game.gameshopapp.core.model.Game;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Arrays;

@Repository
public class GameRepository {

    private List<Game> games;

    public GameRepository() {
        this.games = Arrays.asList(
                new Game(1, "The Evil Within", "Survival horror", "01-01-2014", "Bandai Namco"),
                new Game(2, "Call of Duty MW3", "First-person shooter", "01-01-2022", "Activision")
        );
    }

    public List<Game> findAll() {
        return games;
    }

    public Game findById(int id) {
        return games.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }


}
