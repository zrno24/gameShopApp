package com.game.gameshopapp.core.model;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GameTest {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date releaseDate = dateFormat.parse("01/01/2009");

    public GameTest() throws ParseException {
    }

    @Test
    void shouldCreateNewGame() throws ParseException {


        Game game = new Game(
                "randID",
                "Plants vs Zombies",
                "Tower Defense",
                releaseDate,
                "CapCom",
                "9,5",
                4.99,
                "Electronic Arts"
        );

        Assertions.assertEquals("Plants vs Zombies", game.getTitle());
        Assertions.assertEquals("Electronic Arts", game.getPublisher());
    }

    @Test
    void shouldUpdateGame() {
        Game game = new Game();
        game.setTitle("Apex Legends");
        Assertions.assertEquals("Apex Legends", game.getTitle());
    }

    @Test
    void twoGameComparison()  {

        Game game1 = new Game(
                "someIDnegdjetamo",
                "Plants vs Zombies",
                "Tower Defense",
                new Date(),
                "CapCom",
                "9,5",
                4.99,
                "Electronic Arts"
        );

        Game game2 = new Game(
                "someIDnegdjetamo",
                "Plants vs Zombies",
                "Tower Defense",
                new Date(),
                "CapCom",
                "9,5",
                4.99,
                "Electronic Arts"
        );

        AssertionsForInterfaceTypes.assertThat(game1).usingRecursiveComparison().isEqualTo(game2);
    }



}
