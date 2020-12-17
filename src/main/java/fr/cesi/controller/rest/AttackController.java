package fr.cesi.controller.rest;

import fr.cesi.beans.pokemon.Attack;
import fr.cesi.service.GestionAttack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attack")
public class AttackController {
    GestionAttack gestionAttack = new GestionAttack().getGestionAttack();

    @GetMapping("add/{name}/{strenght}")
    public void add(@PathVariable String name, @PathVariable int strenght){
        if (name != null) {
            Attack attack = new Attack();
            attack.setName(name);
            attack.setStrenght(strenght);
            gestionAttack.add(attack);
        }
    }

    @GetMapping("del/{id}")
    public void del(@PathVariable int id){
        gestionAttack.del(id);
    }

    @GetMapping("all")
    public List<Attack> findAll() {
        return gestionAttack.findAll();
    }

    @GetMapping("one/{id}")
    public Attack one(@PathVariable int id) {
        return gestionAttack.getOne(id);
    }

}
