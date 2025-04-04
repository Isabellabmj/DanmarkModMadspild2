package com.example.danmarkmodmadspild2.Model;

import java.util.List;

public class Opskrift
{
    private String titel;
    private List<Raavare> ingredienser;
    private String billedeURL;

    public Opskrift(String titel, List<Raavare> ingredienser, String billedeURL)
    {
        this.titel = titel;
        this.ingredienser = ingredienser;
        this.billedeURL = billedeURL;
    }


    //Getter
    public String           getTitel()              {return titel;}
    public List<Raavare>    getIngredienser()       {return ingredienser;}
    public String           getBilledeURL()         {return billedeURL;}

    //Setter
    public void     setTitel(String titel)                          {this.titel = titel;}
    public void     setIngredienser(List<Raavare> ingredienser)     {this.ingredienser = ingredienser;}
    public void     setBilledeURL(String billedeURL)                {this.billedeURL = billedeURL;}
}
