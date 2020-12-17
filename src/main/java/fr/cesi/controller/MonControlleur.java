package fr.cesi.controller;

import fr.cesi.bean.Film;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MonControlleur {

    // @RequestMapping(method= RequestMethod.GET, path = "/liste")
    @GetMapping("liste")
    public String maMethode() {
        return "liste";
    }

    @GetMapping("form")
    public ModelAndView monFormulaire() {
        Film f = new Film();
        return new ModelAndView("form",
                "film", f);
    }

    @PostMapping("ajoutFilm")
    public String ajouterUnFilm(@Valid @ModelAttribute("Film") Film f, BindingResult resultat) {
        System.out.println(f);
        if (!resultat.hasErrors()) {
            return "liste";
        } else {
            return "form";
        }
    }
}
