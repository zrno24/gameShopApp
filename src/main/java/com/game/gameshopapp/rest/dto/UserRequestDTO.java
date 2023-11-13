package com.game.gameshopapp.rest.dto;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.model.User;
import com.game.gameshopapp.core.model.enums.UserType;

import java.util.Date;
import java.util.List;

public class UserRequestDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private UserType userType;

    public UserRequestDTO() {}


    public UserRequestDTO(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.userType = user.getUserType();
        this.email = user.getEmail();

    }

    public User toEntity() {
        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserType(userType);
        user.setEmail(email);
        user.setCreationDate(new Date());

        return user;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
