package com.example.danmarkmodmadspild2.Model;

public class Forbruger
{
    private String navn;
    private String email;
    private int tlfNr;

    public Forbruger(String navn, String email, int tlfNr)
    {
        this.navn = navn;
        this.email = email;
        this.tlfNr = tlfNr;
    }

    // Getter
    public String       getNavn()           {return navn;}
    public String       getEmail()          {return email;}
    public int          getTlfNr()          {return tlfNr;}


    // Setter
    public void         setNavn(String navn)        {this.navn = navn;}
    public void         setEmail(String email)      {this.email = email;}
    public void         setTlfNr(int tlfNr)         {this.tlfNr = tlfNr;}
}
