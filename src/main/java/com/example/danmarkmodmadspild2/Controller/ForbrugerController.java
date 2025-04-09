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
    public String findOpskrifter(@RequestParam List<String> ingredienser, Model model)  //@RequestParam bryges til at hente værdier fra HTTP request
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


        List<String> arrabiata = List.of("hvidløg", "løg", "tomat", "chili");
        if (antalMatchendeIngredienser(forbrugerIndtast, arrabiata) >= 2)
        {
            opskrifter.add(new Opskrift(
                    "Pasta Arrabiata",
                    null,
                    "/images/forbruger/pastaArrabiata.png",
                    "En krydret italiensk pastaret med hvidløg, chili og tomat. Perfekt med friskrevet parmesan og lidt basilikum."
            ));
        }


        List<String> omelet = List.of("æg", "purløg", "mælk");
        if (antalMatchendeIngredienser(forbrugerIndtast, omelet) >= 2)
        {
            opskrifter.add(new Opskrift(
                    "Omelet med æg og purløg",
                    null,
                    "/images/forbruger/omelet.png",
                    "Lækker omelet med purløg og cremet konsistens – perfekt til morgenmad eller frokost."
            ));
        }


        List<String> taerte = List.of("kartoffel", "løg", "fløde");
        if (antalMatchendeIngredienser(forbrugerIndtast, taerte) >= 2)
        {
            opskrifter.add(new Opskrift(
                    "Kartoffel-løg tærte",
                    null,
                    "/images/forbruger/taerte.png",
                    "En sprød tærte med kartofler og karamelliserede løg. Perfekt som frokostret."
            ));
        }

        List<String> indiskCurry = List.of("chili", "hvidløg", "løg");
        if(antalMatchendeIngredienser(forbrugerIndtast, indiskCurry) >= 2)
        {
            opskrifter.add(new Opskrift(
                    "Indisk tomat-curry",
                    null,
                    "/images/forbruger/indiskCurry.png",
                    "En fyldig og aromatisk curry med tomat, chili og hvidløg – server med ris eller naan."
            ));
        }

        List<String> tomatSuppe = List.of("chili", "løg", "hvidløg", "tomat");
        if(antalMatchendeIngredienser(forbrugerIndtast, tomatSuppe) >= 2)
        {
            opskrifter.add(new Opskrift(
                    "Spicy tomat suppe",
                    null,
                    "/images/forbruger/tomatsuppe.png",
                    "En varmende, spicy tomatsuppe. Kan toppes med creme fraiche og evt. ristede kikærter eller brødcroutoner."
            ));
        }

        if (opskrifter.isEmpty())
        {
            model.addAttribute("resultat", "Vi fandt ingen matchende opskrifter – prøv med nogle andre ingredienser 🍽️");
        } else {
            model.addAttribute("opskrifter", opskrifter);
        }

        return "forbruger/koeleskab";
    }

    private int antalMatchendeIngredienser(List<String> brugerIngredienser, List<String> opskriftIngredienser)
    {
        int count = 0; //holder styr på hvor mange ingredienser der matcher
        for (String ingrediens : opskriftIngredienser)  //Vi går igennem hver ingrediens i opskriftens ingrediensliste
        {
            if (brugerIngredienser.contains(ingrediens)) //Vi tjekker, om den pågældende opskrift-ingrediens også findes i brugerens liste
            {
                count++;
            }
        }
        return count;
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
