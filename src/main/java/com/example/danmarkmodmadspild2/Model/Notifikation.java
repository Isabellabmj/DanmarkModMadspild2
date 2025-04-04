package com.example.danmarkmodmadspild2.Model;

import java.util.Date;

public class Notifikation
{
    private Forbruger modtager;
    private String besked;
    private Date dato;

    public Notifikation(Forbruger modtager, String besked, Date dato)
    {
        this.modtager = modtager;
        this.besked = besked;
        this.dato = dato;
    }

    //Getter
    public Forbruger        getModtager()       {return modtager;}
    public Date             getDato()           {return dato;}
    public String           getBesked()         {return besked;}

    //Setter
    public void         setModtager(Forbruger modtager)         {this.modtager = modtager;}
    public void         setBesked(String besked)                {this.besked = besked;}
    public void         setDato(Date dato)                      {this.dato = dato;}
}

