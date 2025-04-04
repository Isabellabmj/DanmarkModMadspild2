package com.example.danmarkmodmadspild2.Model;

import java.util.Date;
import java.util.List;

public class Madspildsopslag
{
    private List<Overskudsvare> varer;
    private Date udloebsdato;

    public Madspildsopslag(List<Overskudsvare> varer, Date udloebsdato) {
        this.varer = varer;
        this.udloebsdato = udloebsdato;
    }

    //Getter
    public List<Overskudsvare>      getVarer()              { return varer; }
    public Date                     getUdloebsdato()        { return udloebsdato; }


    //Setter
    public void         setVarer(List<Overskudsvare> varer)         { this.varer = varer; }
    public void         setUdloebsdato(Date udløbsdato)             { this.udloebsdato = udloebsdato; }
}

