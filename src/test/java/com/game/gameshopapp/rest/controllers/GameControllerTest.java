package com.game.gameshopapp.rest.controllers;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.service.GameService;
import com.game.gameshopapp.core.service.JwtService;
import com.game.gameshopapp.core.service.UserService;
import com.game.gameshopapp.rest.configuration.SecurityConfiguration;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@AutoConfigureMockMvc
@WebMvcTest(GameController.class)
@Import(SecurityConfiguration.class)
public class GameControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    GameService gameService;

    @MockBean
    UserService userService;

    @MockBean
    JwtService jwtService;

    @MockBean
    AuthenticationProvider authenticationProvider;

    @Test
    void shouldReturnAllGames() throws Exception {

        Game game = new Game();
        game.setTitle("Witcher 3: Wild Hunt");
        game.setDeveloperStudio("CD Project Red");
        game.setPrice(29.99);

        Mockito.when(gameService.getAllGames()).thenReturn(List.of(game));

        MvcResult result = mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/games/")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String response = result.getResponse().getContentAsString();
        System.out.println(response);
        Assertions.assertEquals(1, (Integer) JsonPath.read(response, "$.length()"));
        Assertions.assertEquals("Witcher 3: Wild Hunt", JsonPath.read(response, "$.[0].title"));
    }
}
