package com.game.gameshopapp.core.repository;

import com.game.gameshopapp.core.model.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class GameRepositoryTest {

    @Autowired
    private GameRepository gameRepository;


    @Test
    public void shouldReturnAllGames() {
        List<Game> games = gameRepository.findAll();

        Assertions.assertEquals(2, games.size());
        Assertions.assertEquals("Plants vs Zobmies", games.get(1).getTitle());
    }

    @Test
    public void shouldFindGameById() {
        Optional<Game> game = gameRepository.findById("65850a1bb553e60526c0cc5b");

        Assertions.assertNotNull(game.orElse(null));
        Assertions.assertEquals("65850a1bb553e60526c0cc5b", game.get().getId());

    }


}
