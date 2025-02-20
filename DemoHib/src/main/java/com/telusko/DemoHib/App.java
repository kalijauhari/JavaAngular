package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
//        Alien tel = new Alien();
//        tel.setAid(101);
//        tel.setAname("Kali");
//        tel.setColor("Pink");
    	
    	AlienName an = new AlienName();
    	an.setFname("hello");
    	an.setLname("he");
    	an.setMname("hel");
    	
        Alien tel = new Alien();
        tel.setAid(102);
        tel.setAname(an);
        tel.setColor("blue");	

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(tel);
        tel = session.get(Alien.class, 101);
        tx.commit();
        
        System.out.println(tel);
        
        session.close();
        sf.close();
    }
}
