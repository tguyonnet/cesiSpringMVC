package fr.cesi.controller;

import fr.cesi.beans.pokemon.Pokemon;
import fr.cesi.service.GestionPokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    GestionPokemon gestionPokemon = new GestionPokemon().getGestionPokemon();

    @GetMapping("add/{}")
    public void add(String name, double height, double weight, int trainer_id, int attack01_id, int attack02_id){
        Pokemon pokemon = new Pokemon();
        pokemon.setName(name);
        pokemon.setHeight(height);
        pokemon.setWeight(weight);
//        pokemon.setTrainer(trainer_id);
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
//
//    @GetMapping("one/{id}")
//    public Optional<Pokemon> findById(@PathVariable int id) {
//        return (Optional<Pokemon>) gestionPokemon.findOneById(id);
//    }


}
