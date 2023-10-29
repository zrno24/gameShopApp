package com.game.gameshopapp.core.model;

import java.util.Objects;

public class Game {
    private int id;

    private String title;

    private String genre;

    private int yearOfRelease;

    private String developerStudio;


    public Game(int id, String title, String genre, int yearOfRelease, String developerStudio) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
        this.developerStudio = developerStudio;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getGenre() {

        return genre;
    }

    public int getYearOfRelease(){

        return yearOfRelease;
    }

    public String getDeveloperStudio(){

        return developerStudio;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDeveloperStudio(String developerStudio) {
        this.developerStudio = developerStudio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title, this.genre, this.developerStudio, this.yearOfRelease);
    }
}
