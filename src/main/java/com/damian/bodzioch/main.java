package com.damian.bodzioch;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {
    public static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();

        User user = new User();
        user.setName("Damian");
        user.setSurname("Bodzioch");
        user.setSex(User.Sex.MEN);
    }

    public static void persistUser(User user){

    }
}

//TODO 3:44
