package fr.cesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MonControlleur {
    // @RequestMapping(method= RequestMethod.GET, path = "/liste")
    @GetMapping("liste")
    public String maMethode() {
        return "liste2";
    }
}
