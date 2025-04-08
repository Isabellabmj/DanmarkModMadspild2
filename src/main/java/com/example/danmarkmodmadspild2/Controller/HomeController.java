package com.example.danmarkmodmadspild2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model)
    {
        return "home/index";
    }

    @GetMapping("/forbruger")
    public String forbruger(Model model)
    {
        return "home/forbruger";
    }


    // Denne metode viser organisationens underside (organisation.html)
    @GetMapping("/organisation")
    public String organisation(Model model) {
        return "organisation/organisation";  // viser organisation.html fra organisation-mappen
    }
}


