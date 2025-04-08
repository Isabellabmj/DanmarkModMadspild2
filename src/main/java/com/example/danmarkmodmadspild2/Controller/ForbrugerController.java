package com.example.danmarkmodmadspild2.Controller;

import com.example.danmarkmodmadspild2.Model.Opskrift;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ForbrugerController
{

    @GetMapping("/forbruger/koeleskab")
    public String visKoeleskabsside()
    {
        return "forbruger/koeleskab";
    }


    @PostMapping("/find-opskrifter")
    public String findOpskrifter(@RequestParam List<String> ingredienser, Model model)
    {
        List<String> forbrugerIndtast = new ArrayList<>();

        for (String i : ingredienser) //Vi gennegår listen af de indtastede ingredienser
        {
            if (i != null && !i.trim().isEmpty()) //fjerner tomme felter og mellemrum
            {
                forbrugerIndtast.add(i.trim().toLowerCase()); //Vi gemmer alt i en ny liste
            }
        }

        List<Opskrift> opskrifter = new ArrayList<>();  //En tom liste, som vi vil fylde med matchende opskrifter, hvis betingelserne nedenfor opfyldes.

        // Er lavet uden råvare objekter, kan tilføjes hvis tid
        if (forbrugerIndtast.contains("hvidløg") && forbrugerIndtast.contains("løg") && forbrugerIndtast.contains("tomat"))
        {
            opskrifter.add(new Opskrift(
                    "Pasta Arrabiata",
                    null,// Vi kan tilføje ingredienser her senere
                    "/images/forbruger/pastaArrabiata.png",
                    "En krydret italiensk pastaret med hvidløg, chili og tomat. Perfekt med friskrevet parmesan og lidt basilikum."
            ));
        }

        if (forbrugerIndtast.contains("æg") && forbrugerIndtast.contains("purløg"))
        {
            opskrifter.add(new Opskrift(
                    "Omelet med æg og purløg",
                    null,
                    "/images/forbruger/omelet.png",
                    "Lækker røræg med purløg..."
            ));
        }

        if (opskrifter.isEmpty())
        {
            model.addAttribute("resultat", "Vi fandt ingen matchende opskrifter – prøv med nogle andre ingredienser 🍽️");
        }
        else
        {
            model.addAttribute("opskrifter", opskrifter);
        }

        return "forbruger/koeleskab";
    }

    /*@PostMapping("/find-opskrifter")
    public String findOpskrifter(@RequestParam String ingredienser, Model model)
    {
        // Simpel logik – her kan vi senere udvide med ægte matches
        model.addAttribute("resultat", "Her er dine resultater baseret på: " + ingredienser);
        return "forbruger/koeleskab";
    }*/

   /* @PostMapping("/find-opskrifter")
    public String findOpskrifter(@RequestParam List<String> ingredienser, Model model)
    {
        List<String> forbrugerIndtast = new ArrayList<>();

        for (String i : ingredienser)
        {
            if (i != null && !i.trim().isEmpty()) //trim, vi fjerner mellemrum før/efter teksten så der ikke kommer fejl fx: " Chorizo" og (isEmpty) feltet ikke er tomt
            {
                forbrugerIndtast.add(i.trim().toLowerCase()); //toLowerCase, vi gør alt småt
            }
        }

        List<String> forslag = new ArrayList<>();

        if (forbrugerIndtast.contains("æg") && forbrugerIndtast.contains("purløg"))
        {
            forslag.add("Omelet med æg og purløg");
        }

        if (forbrugerIndtast.contains("chorizo"))
        {
            forslag.add("Chorizo pasta med tomatsovs");
        }

        if (forbrugerIndtast.contains("æg") && forbrugerIndtast.contains("chorizo"))
        {
            forslag.add("Chorizo scramble – æg med chorizo");
        }

        if(forbrugerIndtast.contains("hvidløg") && forbrugerIndtast.contains("løg") && forbrugerIndtast.contains("hakket tomat") && forbrugerIndtast.contains("chili") && forbrugerIndtast.contains("olivenolie"))
        {
            forslag.add("Pasta arrabiata - \n + En krydret italiensk pastaret med hvidløg, chili og tomat. Perfekt med friskrevet parmesan og lidt basilikum.\",\n" +
                    "        \"/images/forbruger/pastaArrabiata.png");
        }



        /*if (antalMatch(forbrugerIndtast, List.of("hvidløg", "løg", "hakket tomat", "chili", "olivenolie")) >= 3)
        {
            forslag.add("Pasta arrabiata");
        }*/ //Hvis der kun skulle 3 ingredienser til en ret, ved ikke om det giver mening

        //vi mangler en metode der skelner mellem de forskellige opskrifter hvis den både indeholder æg og chorizo.

       /* if (forslag.isEmpty())
        {
            model.addAttribute("resultat", "Vi fandt ingen matchende opskrifter – prøv med nogle andre ingredienser");
        } else
        {
            model.addAttribute("forslag", forslag);
        }

        return "forbruger/koeleskab";
    }

   /* private int antalMatch(List<String> brugerIngredienser, List<String> kravIngredienser)
    {
        int count = 0;
        for (String krav : kravIngredienser)
        {
            if (brugerIngredienser.contains(krav))
            {
                count++;
            }
        }
        return count;
    }*/ // antalMatch metode



    //Hvis vi skulle få køleskabsfunktionen til at virke skulle vi tilføje en database og en get metode til at hente opskrifter
    //der er baseret på de ingredienser der bliver skrevet ind i felterne.*/

}
