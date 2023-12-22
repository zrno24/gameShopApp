package com.game.gameshopapp.core.service;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.repository.GameRepository;
import com.game.gameshopapp.rest.dto.GameRequestDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@AutoConfigureMockMvc
@SpringBootTest
public class GameServiceTest {

    @MockBean
    GameRepository gameRepository;

    @Autowired
    GameService gameService;

    @Test
    public void shouldReturnGameUponCreation() {
        Game game = new Game();
        game.setTitle("Witcher 3: Wild Hunt");
        game.setDeveloperStudio("CD Project Red");
        game.setPrice(29.99);

        Mockito.when(gameRepository.save(ArgumentMatchers.any(Game.class))).thenReturn(game);

        Game savedGame = gameService.addGame(new GameRequestDTO(game));
        Assertions.assertThat(game.getTitle()).isEqualTo(savedGame.getTitle());
        Assertions.assertThat(game.getDeveloperStudio()).isEqualTo(savedGame.getDeveloperStudio());
        Assertions.assertThat(game.getPrice()).isEqualTo(savedGame.getPrice());
    }




}
