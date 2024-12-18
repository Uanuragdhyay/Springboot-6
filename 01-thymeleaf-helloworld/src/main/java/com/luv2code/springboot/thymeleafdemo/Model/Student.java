package com.luv2code.springboot.thymeleafdemo.Model;

import java.util.List;

public class Student {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String Country;
    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    private String FavouriteLanguage;

    public String getFavouriteLanguage() {
        return FavouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        FavouriteLanguage = favouriteLanguage;
    }

    private List<String> FavouriteSystems;
    public List<String> getFavouriteSystems() {
        return FavouriteSystems;
    }

    public void setFavouriteSystems(List<String> favouriteSystems) {
        FavouriteSystems = favouriteSystems;
    }




}
