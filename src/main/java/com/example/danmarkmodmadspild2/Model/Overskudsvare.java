package com.example.danmarkmodmadspild2.Model;

import java.util.Date;
import java.util.List;

public class Overskudsvare
{
    private String navn;
    private float maengde;
    private String enhed;
    private Date udloebsdato;
    private String lokation;
    private Virksomhed tilbyder;

    public Overskudsvare(String navn, float maengde, String enhed, Date udloebsdato, String lokation, Virksomhed tilbyder)
    {
        this.navn = navn;
        this.maengde = maengde;
        this.enhed = enhed;
        this.udloebsdato = udloebsdato;
        this.lokation = lokation;
        this.tilbyder = tilbyder;
    }

    //Getter
    public String       getNavn()               { return navn; }
    public float        getMaengde()            { return maengde; }
    public String       getEnhed()              { return enhed; }
    public Date         getUdloebsdato()        { return udloebsdato; }
    public String       getLokation()           { return lokation; }
    public Virksomhed   getTilbyder()           { return tilbyder; }

    //Setter
    public void         setNavn(String navn)                { this.navn = navn; }
    public void         setMaengde(float maengde)           { this.maengde = maengde; }
    public void         setEnhed(String enhed)              { this.enhed = enhed; }
    public void         setUdloebsdato(Date udloebsdato)    { this.udloebsdato = udloebsdato; }
    public void         setLokation(String lokation)        { this.lokation = lokation; }
    public void         setTilbyder(Virksomhed tilbyder)    { this.tilbyder = tilbyder; }



    //Metode til at slette
    public void deleteOverskudsvare(List<Overskudsvare> overskudsvareListe)
    {
        overskudsvareListe.remove(this);
    }
}
