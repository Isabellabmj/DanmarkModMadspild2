package com.example.danmarkmodmadspild2.Model;

public class Virksomhed
{
    private int CVRnr;
    private String navn;
    private String kontaktperson;
    private String email;

    public Virksomhed(int CVRnr, String navn, String kontaktperson, String email)
    {
        this.CVRnr = CVRnr;
        this.navn = navn;
        this.kontaktperson = kontaktperson;
        this.email = email;
    }

    public int      getCVRnr()              {return CVRnr;}
    public String   getNavn()               {return navn;}
    public String   getKontaktperson()      {return kontaktperson;}
    public String   getEmail()              {return email;}

    public void         setCVRnr(int CVRnr)                     {this.CVRnr = CVRnr;}
    public void         setNavn(String navn)                    {this.navn = navn;}
    public void         setKontaktperson(String kontaktperson)  {this.kontaktperson = kontaktperson;}
    public void         setEmail(String email)                  {this.email = email;}
}

