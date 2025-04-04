package com.example.danmarkmodmadspild2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        return "home/index";
    }

    @GetMapping("/virksomhed")
    public String showVirksomhedPage() {
        return "home/virksomhed";
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        return "home/virksomhed-signup";
    }

    @PostMapping("/signup")
    public String handleSignup(@RequestParam String companyName,
                               @RequestParam String email,
                               @RequestParam String location,
                               @RequestParam String password) {
        // signup validering
        return "redirect:/home/login"; // omdirigerer til login ved signup succes
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "home/virksomhed-login";
    }
}
