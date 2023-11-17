package com.game.gameshopapp.rest.dto;

import com.game.gameshopapp.core.model.Game;

import java.util.Date;

public class GameDTO {
    private String id;

    private String title;

    private String genre;

    private Date yearOfRelease;

    private String developerStudio;

    private String rating;

    private double price;

    private String publisher;

    public GameDTO (Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.genre = game.getGenre();
        this.yearOfRelease = game.getYearOfRelease();
        this.developerStudio = game.getDeveloperStudio();
        this.rating = game.getRating();
        this.price = game.getPrice();
        this.publisher = game.getPublisher();
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Date yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getDeveloperStudio() {
        return developerStudio;
    }

    public void setDeveloperStudio(String developerStudio) {
        this.developerStudio = developerStudio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }




}
