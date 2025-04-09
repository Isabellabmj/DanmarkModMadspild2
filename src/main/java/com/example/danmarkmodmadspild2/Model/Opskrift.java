package com.example.danmarkmodmadspild2.Model;

import java.util.List;

public class Opskrift
{
    private String titel;
    private List<Raavare> ingredienser;
    private String billedeURL;
    private String beskrivelse;

    public Opskrift(String titel, List<Raavare> ingredienser, String billedeURL, String beskrivelse)
    {
        this.titel = titel;
        this.ingredienser = ingredienser;
        this.billedeURL = billedeURL;
        this.beskrivelse = beskrivelse;
    }

    // Getters
    public String getTitel() {
        return titel;
    }

    public List<Raavare> getIngredienser() {
        return ingredienser;
    }

    public String getBilledeURL() {
        return billedeURL;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    // Setters
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setIngredienser(List<Raavare> ingredienser) {
        this.ingredienser = ingredienser;
    }

    public void setBilledeURL(String billedeURL) {
        this.billedeURL = billedeURL;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
}