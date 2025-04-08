package com.example.danmarkmodmadspild2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ForbrugerController {

    @GetMapping("/forbruger/koeleskab")
    public String visKoeleskabsside()
    {
        return "forbruger/koeleskab"; // matcher /templates/forbruger/koeleskab.html
    }

    @PostMapping("/find-opskrifter")
    public String findOpskrifter(@RequestParam String ingredienser, Model model)
    {
        // Simpel logik – her kan vi senere udvide med ægte matches
        model.addAttribute("resultat", "Her er dine resultater baseret på: " + ingredienser);
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
