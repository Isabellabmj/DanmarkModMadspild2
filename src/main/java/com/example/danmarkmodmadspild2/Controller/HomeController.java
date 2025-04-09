package com.example.danmarkmodmadspild2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "forbruger/forbruger";
    }



    @GetMapping("/informationsSide")
    public String informationsSide() {
        return "virksomhed/informationsSide";  // Returnerer "informationsSide" view via POST
    }

    @GetMapping("/virksomhed")
    public String showVirksomhedPage() {
        return "virksomhed/virksomhed";
    }

    @GetMapping("/virksomhed-signup")
    public String showSignupPage() {
        return "virksomhed/virksomhed-signup";
    }

    @GetMapping("/virksomhed-signup-bekraeftelse")
    public String visBekraeftelse() {
        return "virksomhed/virksomhed-signup-bekraeftelse";
    }

    @PostMapping("/virksomhed-signup")
    public String handleSignup(@RequestParam String virksomhedsnavn,
                               @RequestParam String cvrNr,
                               @RequestParam String email,
                               @RequestParam String lokation,
                               @RequestParam String kodeord) {

        return "redirect:virksomhed/virksomhed-signup-bekraeftelse";
    }

    @GetMapping("/virksomhed-login")
    public String showLoginPage() {
        return "virksomhed/virksomhed-login";
    }

    @PostMapping("/virksomhed-login")
    public String loginVirksomhed(@RequestParam String brugernavn,
                                  @RequestParam String kodeord,
                                  Model model) {
        if ((brugernavn.equals("firma123") || brugernavn.equals("firma@mail.com")) && kodeord.equals("hemmelig123")) {
            return "redirect:virksomhed/virksomhed-dashboard";
        } //Hard coded brugernavn, mail og password, normalt ville det naturligvis ligge i en database.

        if (brugernavn.isEmpty() || kodeord.isEmpty()) {
            model.addAttribute("loginFejl", "Brugernavn og kodeord skal udfyldes.");
        } else {
            model.addAttribute("loginFejl", "Forkert brugernavn eller kodeord.");
        }
        return "virksomhed/virksomhed-login";
    }

    @GetMapping("/virksomhed-dashboard")
    public String showDashboard() {
        return "virksomhed/virksomhed-dashboard";  // Returner dashboard view

    }

}