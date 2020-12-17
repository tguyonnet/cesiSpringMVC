package fr.cesi.service;

import fr.cesi.beans.pokemon.Pokemon;
import fr.cesi.beans.pokemon.Trainer;
import fr.cesi.dao.PokemonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "gestionPokemon")
public class GestionPokemon extends fr.cesi.service.Service {
    @Autowired
    PokemonDAO dao;

    public GestionPokemon getGestionPokemon() {
        return this.getContext().getBean("gestionPokemon", GestionPokemon.class);
    }

    public List<Pokemon> findAll() {
        return dao.findAll();
    }

    public Pokemon getOne(int id) {
        return dao.findById(id).orElse(null);
    }

    public void add(Pokemon pokemon) {
        dao.save(pokemon);
    }

    public void del(int id) {
        dao.deleteById(id);
    }
}
