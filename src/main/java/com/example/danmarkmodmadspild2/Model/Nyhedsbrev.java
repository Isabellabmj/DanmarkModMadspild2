package com.example.danmarkmodmadspild2.Model;

import java.util.Date;
import java.util.List;

public class Nyhedsbrev
{
    private String titel;
    private String indhold;
    private Date udgivelsesDato;
    private List<Forbruger> modtager;

    public Nyhedsbrev(String titel, String indhold, Date udgivelsesDato, List<Forbruger> modtager)
    {
        this.titel = titel;
        this.indhold = indhold;
        this.udgivelsesDato = udgivelsesDato;
        this.modtager = modtager;
    }

    // Getter
    public String       getTitel()          {return titel;}
    public String       getIndhold()        {return indhold;}
    public Date         getUdgivelsesDato() {return udgivelsesDato;}
    public List<Forbruger> getModtager()    {return modtager;}


    //Setter

    // Setter
    public void      setTitel(String titel)                     {this.titel = titel;}
    public void      setIndhold(String indhold)                 {this.indhold = indhold;}
    public void      setUdgivelsesDato(Date udgivelsesDato)     {this.udgivelsesDato = udgivelsesDato;}
    public void      setModtager(List<Forbruger> modtager)      {this.modtager = modtager;}
}
