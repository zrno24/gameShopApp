package com.game.gameshopapp.core.service;

import com.game.gameshopapp.core.api.mailsender.MailSender;
import com.game.gameshopapp.core.model.User;
import com.game.gameshopapp.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    private MailSender mailgunSender;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
