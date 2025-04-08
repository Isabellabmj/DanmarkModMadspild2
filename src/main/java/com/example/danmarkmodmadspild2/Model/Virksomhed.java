package com.example.danmarkmodmadspild2.Model;

public class Virksomhed {
    private String virksomhedsnavn;
    private String cvrNr;
    private String email;
    private String lokation;
    private String kodeord;


    public String getVirksomhedsnavn() {
        return virksomhedsnavn;
    }

    public void setVirksomhedsnavn(String virksomhedsnavn) {
        this.virksomhedsnavn = virksomhedsnavn;
    }


    public String getCvrNr() {
        return cvrNr;
    }

    public void setCvrNr(String cvrNr) {
        this.cvrNr = cvrNr;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLokation() {
        return lokation;
    }

    public void setLokation(String lokation) {
        this.lokation = lokation;
    }


    public String getKodeord() {
        return kodeord;
    }

    public void setKodeord(String kodeord) {
        this.kodeord = kodeord;
    }
}
