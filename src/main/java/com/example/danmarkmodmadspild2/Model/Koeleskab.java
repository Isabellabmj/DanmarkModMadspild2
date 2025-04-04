package com.example.danmarkmodmadspild2.Model;

import java.util.List;

public class Koeleskab
{
    private List<Raavare> indhold;

    public Koeleskab(List<Raavare> indhold)
    {
        this.indhold = indhold;
    }

    //Getter
    public List<Raavare> getIndhold() {return indhold;}

    //Setter
    public void setIndhold(List<Raavare> indhold) {this.indhold = indhold;}
}
