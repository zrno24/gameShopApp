package com.game.gameshopapp.core.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;
@Document
public class Game {
    @Id
    private String id;

    private String title;

    private String genre;

    private Date yearOfRelease;

    private String developerStudio;

    private String rating;

    private double price;

    private String publisher;


    public Game(String id, String title, String genre, Date yearOfRelease, String developerStudio, String rating, double price, String publisher) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
        this.developerStudio = developerStudio;
        this.rating = rating;
        this.price = price;
        this.publisher = publisher;
    }

    public Game() {}

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public Date getYearOfRelease(){
        return yearOfRelease;
    }

    public void setYearOfRelease(Date yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }

    public String getDeveloperStudio(){
        return developerStudio;
    }

    public void setDeveloperStudio(String developerStudio) {
        this.developerStudio = developerStudio;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

}
