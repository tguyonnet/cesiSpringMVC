package fr.cesi.controller;

import fr.cesi.bean.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MonControlleurRest {

    @GetMapping("/un")
    public int un() {
        return 1;
    }

    @GetMapping("/film")
    public Film unFilm() {
        Film f = new Film("La reine des neiges", "Un mec bien");
        return f;
    }
}
