package com.game.gameshopapp.core.service;

import com.game.gameshopapp.core.exceptions.repository.ResourceNotFoundException;
import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.repository.GameRepository;
import com.game.gameshopapp.rest.dto.GameDTO;
import com.game.gameshopapp.rest.dto.GameRequestDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        List<Game> games = gameRepository.findAll();
        return games;
    }

    public Game getGameById(String id) {
        Optional<Game> game = gameRepository.findById(id);
        if (game.isEmpty()) {
            throw new ResourceNotFoundException("The game with the given ID does not exist;");
        }
        return game.get();
    }

    public Game findGameByTitle(String title) {
        Optional<Game> game = gameRepository.findGameByTitle(title);
        if (game.isEmpty()) {
            throw new ResourceNotFoundException("The game with the given title does not exist;");
        }
        return game.get();
    }

    public Game findGameByGenre(String genre) {
        Optional<Game> game = gameRepository.findByGenreCustom(genre);
        if (game.isEmpty()) {
            throw new ResourceNotFoundException("The game with the given genre does not exist;");
        }
        return game.get();
    }

    public Game addGame(GameRequestDTO payload) {
        return gameRepository.save(payload.toGame());
    }

    public Game updateGame(String id, GameRequestDTO payload) {
        Optional<Game> game = gameRepository.findById(id);

        if(game.isEmpty()) {
            throw new ResourceNotFoundException("The game with the given ID does not exist");
        }

        Game updatedGame = payload.toGame();
        updatedGame.setId(game.get().getId());
        updatedGame = gameRepository.save(updatedGame);
        return updatedGame;
    }

    public void deleteGame(String id) {
        Optional<Game> game = gameRepository.findById(id);
        game.ifPresent(gameRepository::delete);
    }



}
