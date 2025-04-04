package com.example.danmarkmodmadspild2.Model;

import java.util.Date;

public class Raavare
{

    private String raavareNavn;
    private float maengde;
    private String enhed;
    private Date udloebsdato;
    private String kategori;

    public Raavare(String raavareNavn, float maengde, String enhed, Date udloebsdato, String kategori) {
        this.raavareNavn = raavareNavn;
        this.maengde = maengde;
        this.enhed = enhed;
        this.udloebsdato = udloebsdato;
        this.kategori = kategori;
    }

    //Getters
    public String       getRaavareNavn()    {return raavareNavn;}
    public float        getMaengde()        {return maengde;}
    public String       getEnhed()          {return enhed;}
    public Date         getUdloebsdato()    {return udloebsdato;}
    public String       getKategori()       {return kategori;}

    //Setters
    public void     setRaavareNavn(String raavareNavn)      {this.raavareNavn = raavareNavn;}
    public void     setMaengde(float maengde)               {this.maengde = maengde;}
    public void     setEnhed(String enhed)                  {this.enhed = enhed;}
    public void     setUdloebsdato(Date udloebsdato)        {this.udloebsdato = udloebsdato;}
    public void     setKategori(String kategori)            {this.kategori = kategori;}
}
