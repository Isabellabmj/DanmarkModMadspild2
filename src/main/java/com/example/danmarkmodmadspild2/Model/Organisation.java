package com.example.danmarkmodmadspild2.Model;

public class Organisation
{
    private String navn;
    private String kontaktPerson;
    private String email;


    public Organisation(String navn, String kontaktPerson, String email)
    {
        this.navn = navn;
        this.kontaktPerson = kontaktPerson;
        this.email = email;

    }

    //Getter
    public String       getNavn()               {return navn;}
    public String       getKontaktPerson()      {return kontaktPerson;}
    public String       getEmail()              {return email;}

    //Setter
    public void         setNavn(String navn)                            {this.navn = navn;}
    public void         setKontaktPerson(String kontaktPerson)          {this.kontaktPerson = kontaktPerson;}
    public void         setEmail(String email)                          {this.email = email;}
}
