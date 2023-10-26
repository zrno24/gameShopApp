package com.game.gameshopapp.core.service;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.repository.GameRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public Game findById(@PathVariable int id) {
        return gameRepository.findById(id);
    }


}
