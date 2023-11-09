package com.game.gameshopapp.core.repository;

import com.game.gameshopapp.core.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepository {

    private List<User> users;

    public List<User> findAll() {
        return users;
    }

}
