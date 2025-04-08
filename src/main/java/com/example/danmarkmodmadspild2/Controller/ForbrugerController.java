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
        return "forbruger/koeleskab"; // matcher /templates/forbruger/koeleskab.html
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


    @GetMapping("/forbruger/informationspage")
    public String informationsPage()
    {
        return "forbruger/informationspage";
    }

    @GetMapping("/forbruger/frivilig")
    public String frivilig()
    {
        return "forbruger/frivilig";
    }

    @GetMapping("/forbruger/nyhedsbrev")
    public String nyhedsbrev()
    {
        return "forbruger/nyhedsbrev";
    }
}
