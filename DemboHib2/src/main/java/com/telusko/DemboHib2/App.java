package com.telusko.DemboHib2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLname("HP");

        Student student = new Student();
        student.setRollno(1);
        student.setName("John");
        student.setMarks(90);
        student.setLaptop(laptop);
        laptop.setStudent(student);

        Course course1 = new Course();
        course1.setCname("Java");

        Course course2 = new Course();
        course2.setCname("Python");

        student.getCourses().add(course1);
        student.getCourses().add(course2);

        course1.getEnrolledStudents().add(student);
        course2.getEnrolledStudents().add(student);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class).addAnnotatedClass(Course.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.persist(student);

        tx.commit();

        session.close();
    }
}
