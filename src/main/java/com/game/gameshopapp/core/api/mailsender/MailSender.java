package com.game.gameshopapp.core.api.mailsender;

import com.game.gameshopapp.core.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MailSender {

    public String send(List<User> users, String message);
}
