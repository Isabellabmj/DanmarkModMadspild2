package com.example.danmarkmodmadspild2.Controller;

import com.example.danmarkmodmadspild2.Model.Overskudsvare;
import com.example.danmarkmodmadspild2.Model.Vare;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OverskudsvareController {


    private List<Overskudsvare> overskudsvarer = new ArrayList<>();
    private static List<Vare> varer = new ArrayList<>();

    static {
        varer.add(new Vare(1L, "Mælk", "2025-04-11", 10));
        varer.add(new Vare(2L, "Brød", "2025-04-12", 5));
        varer.add(new Vare(3L, "Æbler", "2025-04-12", 20));
    }

    @GetMapping("/overskudsvare-dashboard")
    public String showDashboard(Model model) {

        model.addAttribute("varer", overskudsvarer);
        return "home/virksomhed-dashboard";
    }


    @PostMapping("/registrer-overskudsvare")
    public String registrerOverskudsvare(@RequestParam String varenavn,
                                        @RequestParam String udloebsDato,
                                        @RequestParam int antal,
                                        Model model) {
        LocalDate date = LocalDate.parse(udloebsDato);


        if (date.isBefore(LocalDate.now())) {
            model.addAttribute("fejlbesked", "Udløbsdato må ikke være i fortiden.");
            return "home/virksomhed-dashboard";
        }

        // Oprette og tilføje overskudsvare
        Overskudsvare nyVare = new Overskudsvare(varenavn, date, antal);
        overskudsvarer.add(nyVare);

        // Sortere varer efter udløbsdato
        overskudsvarer.sort(Overskudsvare::compareTo);

        model.addAttribute("succesbesked", "Varen blev registreret succesfuldt!");
        model.addAttribute("varer", overskudsvarer);

        return "home/virksomhed-dashboard"; // Returner til dashboardet
    }


    @GetMapping("/virksomhed-administrer-varer")
    public String visVarer(Model model, @ModelAttribute("successMessage") String successMessage) {
        model.addAttribute("varer", varer);
        model.addAttribute("successMessage", successMessage);
        return "home/virksomhed-administrer-varer";
    }

    @GetMapping("/virksomhed/slet/{id}")
    public String sletVare(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        varer.removeIf(v -> v.getId().equals(id));
        redirectAttributes.addFlashAttribute("successMessage", "Varen blev slettet!");
        return "redirect:/virksomhed-administrer-varer";
    }
}


