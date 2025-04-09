package com.example.danmarkmodmadspild2.Model;

public class Vare {
    private Long id;
    private String navn;
    private String udløbsdato;
    private int antal;

    public Vare() {
        // Tom konstruktør til Thymeleaf, hvis nødvendigt
    }

    public Vare(Long id, String navn, String udløbsdato, int antal) {
        this.id = id;
        this.navn = navn;
        this.udløbsdato = udløbsdato;
        this.antal = antal;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNavn() {
        return navn;
    }

    public String getUdløbsdato() {
        return udløbsdato;
    }

    public int getAntal() {
        return antal;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setUdløbsdato(String udløbsdato) {
        this.udløbsdato = udløbsdato;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }
}