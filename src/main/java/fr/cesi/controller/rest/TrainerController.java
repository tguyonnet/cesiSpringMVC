package fr.cesi.controller.rest;

import fr.cesi.beans.pokemon.Trainer;
import fr.cesi.service.GestionTrainer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    GestionTrainer gestionTrainer = new GestionTrainer().getGestionTrainer();

    @GetMapping("add/{firstname}/{name}")
    public void add(@PathVariable String firstname, @PathVariable String name){
        if (firstname != null & name != null) {
            Trainer trainer = new Trainer();
            trainer.setFirstname(firstname);
            trainer.setName(name);
            gestionTrainer.add(trainer);
        }
    }

    @GetMapping("del/{id}")
    public void del(@PathVariable int id){
        gestionTrainer.del(id);
    }

    @GetMapping("all")
    public List<Trainer> findAll() {
        return gestionTrainer.findAll();
    }

    @GetMapping("one/{id}")
    public Trainer one(@PathVariable int id) {
        return gestionTrainer.getOne(id);
    }

}
