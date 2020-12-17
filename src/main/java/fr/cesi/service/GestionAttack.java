package fr.cesi.service;

import fr.cesi.beans.pokemon.Attack;
import fr.cesi.beans.pokemon.Trainer;
import fr.cesi.dao.AttackDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service(value = "gestionAttack")
public class GestionAttack extends fr.cesi.service.Service {

    @Autowired
    AttackDAO dao;

    @PersistenceContext
    private EntityManager em;

    public GestionAttack getGestionAttack() {
        return this.getContext().getBean("gestionAttack", GestionAttack.class);
    }

    public List<Attack> findAll() {
        return dao.findAll();
    }

    public Attack getOne(int id) {
        return dao.findById(id).orElse(null);
    }

    public void add(Attack attack) {
        dao.save(attack);
    }

    public void del(int id) {
        dao.deleteById(id);
    }
}
