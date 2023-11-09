package com.game.gameshopapp.core.exceptions.auth;

import com.game.gameshopapp.core.exceptions.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidParametersSentException extends GeneralException {

    public InvalidParametersSentException() {
        super(InvalidParametersSentException.BAD_REQUEST.value());
    }

    public InvalidParametersSentException(String message) {
        super(InvalidParametersSentException.BAD_REQUEST.value(), message);
    }


}
