package com.game.gameshopapp.core.model;

import com.game.gameshopapp.core.api.mailsender.MailSender;
import com.game.gameshopapp.core.model.enums.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;
import java.util.List;

@Document
public class User {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private Date creationDate;
    private UserType userType;
    private List<Game> ownedGames;
    private List<Game> wishlist;


    public User(int id, String firstName, String lastName, String email, String userName, String password, Date creationDate, UserType userType, List<Game> ownedGames, List<Game> wishlist) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
        this.userType = userType;
        this.ownedGames = ownedGames;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Game> getOwnedGames() {
        return ownedGames;
    }

    public void setOwnedGames(List<Game> ownedGames) {
        this.ownedGames = ownedGames;
    }

    public List<Game> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<Game> wishlist) {
        this.wishlist = wishlist;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.userName, this.email, this.password, this.creationDate, this.ownedGames, this.wishlist);
    }


}
