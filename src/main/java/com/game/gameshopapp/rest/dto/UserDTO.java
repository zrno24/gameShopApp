package com.game.gameshopapp.rest.dto;

import com.game.gameshopapp.core.model.User;
import com.game.gameshopapp.core.model.enums.UserType;

import java.util.*;

public class UserDTO  {

    private String id;
    private String name;
    private String firstName;
    private String lastName;
    private String username;
    private UserType userType;
    private String password;
    private String email;
    private Date creationDate;



    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getFirstName() + " " + user.getLastName();
        this.username = user.getUserName();
        this.userType = user.getUserType();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.creationDate = user.getCreationDate();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserType getUserType(){
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }






}
