package com.game.gameshopapp.core.exceptions.auth;

import com.game.gameshopapp.core.exceptions.GeneralException;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends GeneralException {
    public UnauthorizedException() {
        super(HttpStatus.UNAUTHORIZED.value());
    }

    public UnauthorizedException(String message) {
        super(HttpStatus.UNAUTHORIZED.value(), message);
    }
}
