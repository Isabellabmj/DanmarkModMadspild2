package com.example.danmarkmodmadspild2.Model;

import java.util.List;
import java.time.LocalDate;

public class Overskudsvare implements Comparable<Overskudsvare> {
    private String varenavn;
    private LocalDate udloebsDato;
    private int antal;
    private boolean tilgaengelig;

    public Overskudsvare(String varenavn, LocalDate udloebsDato, int antal) {
        if (udloebsDato.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Udløbsdato må ikke være i fortiden.");
        }

        this.varenavn = varenavn;
        this.udloebsDato = udloebsDato;
        this.antal = antal;
        this.tilgaengelig = true; // automatisk sat tilgængelig
    }

    // Gettere og settere
    public String getVarenavn() {
        return varenavn;
    }

    public void setVarenavn(String varenavn) {
        this.varenavn = varenavn;
    }

    public LocalDate getUdloebsDato() {
        return udloebsDato;
    }

    public void setUdloebsDato(LocalDate udloebsDato) {
        if (udloebsDato.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Udløbsdato må ikke være i fortiden.");
        }
        this.udloebsDato = udloebsDato;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public boolean isTilgaengelig() {
        return tilgaengelig;
    }

    public void setTilgaengelig(boolean tilgaengelig) {
        this.tilgaengelig = tilgaengelig;
    }

    @Override
    public int compareTo(Overskudsvare andenVare) {
        return this.udloebsDato.compareTo(andenVare.getUdloebsDato());
    }

    //Metode til at slette
    public void deleteOverskudsvare(List<Overskudsvare> overskudsvareListe) {
        overskudsvareListe.remove(this);
    }

    @Override
    public String toString() {
        return varenavn + " - " + udloebsDato + " - " + antal + " stk";
    }
}

