package fr.cesi.service;

import fr.cesi.beans.pokemon.Trainer;
import fr.cesi.dao.TrainerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "gestionTrainer")
public class GestionTrainer extends fr.cesi.service.Service {
    @Autowired
    TrainerDAO dao;

    public GestionTrainer getGestionTrainer() {
        return this.getContext().getBean("gestionTrainer", GestionTrainer.class);
    }

    public List<Trainer> findAll() {
        return dao.findAll();
    }

    public Trainer getOne(int id) {
        return dao.findById(id).orElse(null);
    }

    public void add(Trainer trainer) {
        dao.save(trainer);
    }

    public void del(int id) {
        dao.deleteById(id);
    }
}
