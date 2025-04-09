package com.example.danmarkmodmadspild2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrganisationController {

    @GetMapping("/organisation")
    public String organisation(Model model) {
        return "organisation/organisation";
    }

}
