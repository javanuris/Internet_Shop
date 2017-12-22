package kz.nuris.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by User on 22.12.2017.
 */
public class HiberanteSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    public static Session getSession() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;
    }

    private static void createSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            sessionFactory = configuration.buildSessionFactory();
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}
