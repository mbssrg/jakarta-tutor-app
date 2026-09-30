package com.example.ejb;

import com.example.entity.Tutor;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TutorService {

    @PersistenceContext(unitName = "TutorPU")
    private EntityManager em;

    public List<Tutor> findAll() {
        return em.createQuery("SELECT t FROM Tutor t", Tutor.class).getResultList();
    }

    public Tutor findById(Long id) {
        return em.find(Tutor.class, id);
    }

    public void create(Tutor tutor) {
        em.persist(tutor);
    }

    public void delete(Long id) {
        Tutor tutor = em.find(Tutor.class, id);
        if (tutor != null) {
            em.remove(tutor);
        }
    }
}