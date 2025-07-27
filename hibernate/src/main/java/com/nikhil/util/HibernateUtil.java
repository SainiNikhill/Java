package com.nikhil.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sf;

    static{
        try {
            sf = new Configuration()
                    .configure() // loads hibernate xml
                    .buildSessionFactory();
        } catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sf;
    }

}
