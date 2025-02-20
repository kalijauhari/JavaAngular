package com.telusko.DemoHib3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration con = new Configuration()
                .configure()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(AlienName.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Inserting AlienName
        AlienName name = new AlienName();
        name.setId(1);
        name.setFname("John");
        name.setLname("Doe");
        session.persist(name);

        // Inserting Alien
        Alien alien = new Alien();
        alien.setAid(101);
        alien.setColor("Green");
        alien.setAname(name);
        session.persist(alien);

        tx.commit();
        session.close();

        // Retrieving Data with FetchType.LAZY
        Session newSession = sf.openSession();
        Alien retrievedAlien = newSession.get(Alien.class, 101);
        
        System.out.println("\n--- FetchType.LAZY Demonstration ---");
        System.out.println("Alien fetched: " + retrievedAlien);

        // Accessing aname (this should trigger a separate query)
        System.out.println("Fetching AlienName...");
        System.out.println("Alien Name: " + retrievedAlien.getAname().getFname() + " " + retrievedAlien.getAname().getLname());

        newSession.close();
        sf.close();
    }
}