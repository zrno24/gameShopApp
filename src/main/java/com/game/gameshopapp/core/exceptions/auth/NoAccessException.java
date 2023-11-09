package com.game.gameshopapp.core.exceptions.auth;

import com.game.gameshopapp.core.exceptions.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class NoAccessException extends GeneralException {

    public NoAccessException() {
        super(HttpStatus.FORBIDDEN.value());
    }

    public NoAccessException(String message) {
        super(HttpStatus.FORBIDDEN.value(), message);
    }
}
