package fr.cesi.controller.rest;

import fr.cesi.beans.pokemon.Pokemon;
import fr.cesi.service.GestionPokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    GestionPokemon gestionPokemon = new GestionPokemon().getGestionPokemon();

    @GetMapping("add/{name}/{height}/{weight}")
    public void add(@PathVariable String name, @PathVariable double height, @PathVariable double weight){
        Pokemon pokemon = new Pokemon();
        pokemon.setName(name);
        pokemon.setHeight(height);
        pokemon.setWeight(weight);
        gestionPokemon.add(pokemon);
    }

    @GetMapping("del/{id}")
    public void del(@PathVariable int id){
        gestionPokemon.del(id);
    }

    @GetMapping("all")
    public List<Pokemon> findAll() {
        return gestionPokemon.findAll();
    }

    @GetMapping("one/{id}")
    public Pokemon one(@PathVariable int id) {
        return gestionPokemon.getOne(id);
    }

}
