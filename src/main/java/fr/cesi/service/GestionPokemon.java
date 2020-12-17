package fr.cesi.service;

import fr.cesi.beans.pokemon.Pokemon;
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

    public Object findOneById(int id) {
        Optional<Pokemon> pokemon = dao.findById(id);
        if (pokemon.isPresent()){
            return pokemon;
        }
        return null;
    }

    public void add(Pokemon pokemon) {
        dao.save(pokemon);
    }

    public void del(int id) {
        Pokemon pokemon = (Pokemon) findOneById(id);
        if (pokemon != null) {
            dao.delete(pokemon);
        }
    }
}
