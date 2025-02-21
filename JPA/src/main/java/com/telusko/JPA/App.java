package com.telusko.JPA;

import jakarta.persistence.*;

public class App {
    public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit"); 
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Alien alien = new Alien();
        alien.setColor("Green");
        em.persist(alien);  

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
