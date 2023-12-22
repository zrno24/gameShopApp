package com.game.gameshopapp.rest.controllers;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.service.GameService;
import com.game.gameshopapp.rest.dto.GameDTO;
import com.game.gameshopapp.rest.dto.GameRequestDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/games")
@SecurityRequirement(name = "JWT Security")
public class GameController {
    private final GameService gameService;
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity<List<Game>> getGames() {
        return ResponseEntity.ok(gameService.getAllGames());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable String id) {
        return ResponseEntity.ok(gameService.getGameById(id));
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addGame")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Game> addGame(@RequestBody GameRequestDTO game) {
        return ResponseEntity.ok(gameService.addGame(game));
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/updateGame/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Game> updateGame(@PathVariable String id, @RequestBody GameRequestDTO game) {
        return ResponseEntity.ok(gameService.updateGame(id, game));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/deleteGame/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Game> deleteGame(@PathVariable String id) {
        gameService.deleteGame(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
