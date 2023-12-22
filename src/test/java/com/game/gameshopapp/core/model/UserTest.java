package com.game.gameshopapp.core.model;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.game.gameshopapp.core.model.enums.UserType.ADMIN;

public class UserTest {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date releaseDate = dateFormat.parse("01/01/2009");

    public UserTest() throws ParseException {
    }

    @Test
    void shouldCreateNewUser() {

        List<Game> HarisDzinovicFavoriteGames = new ArrayList<>();
        List<Game> HarisDzinovicWishList = new ArrayList<>();

        HarisDzinovicFavoriteGames.add(new Game("someIDnegdjetamo",
                "Plants vs Zombies",
                "Tower Defense",
                new Date(),
                "CapCom",
                "9,5",
                4.99,
                "Electronic Arts"));

        HarisDzinovicWishList.add(new Game("someTotallyRandomID",
                "GTA 6",
                "Open-world, third-person",
                new Date(),
                "Rockstar Games",
                "9,5",
                129.99,
                "Rockstar Games"));

        User user = new User(
                "someID",
                "Haris",
                "Dzinovic",
                "harisdzinovic@zvezdegranda.com",
                "hare42069",
                "harisharis123",
                new Date(),
                ADMIN,
                HarisDzinovicFavoriteGames,
                HarisDzinovicWishList
        );

        Assertions.assertEquals("Haris", user.getFirstName());
        Assertions.assertEquals(ADMIN, user.getUserType());
    }

    @Test
    void shouldUpdateUser() {
        User user = new User();
        user.setPassword("AsimBajricNumber1");

        Assertions.assertEquals("AsimBajricNumber1", user.getPassword());
    }

}
