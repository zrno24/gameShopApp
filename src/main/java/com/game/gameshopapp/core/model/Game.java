package com.game.gameshopapp.core.model;

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
}
