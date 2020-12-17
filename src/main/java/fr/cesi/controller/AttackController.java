package fr.cesi.controller;

import fr.cesi.beans.pokemon.Attack;
import fr.cesi.service.GestionAttack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attack")
public class AttackController {
    GestionAttack attack = new GestionAttack().getGestionAttack();

    @GetMapping("add")
    public void add(){
    }

    @GetMapping("del")
    public void del(){
    }

    @GetMapping("all")
    public List<Attack> findAll() {
        return attack.findAll();
    }

    @GetMapping("one/{id}")
    public Attack findById(int id) {
        return null;
    }

}
