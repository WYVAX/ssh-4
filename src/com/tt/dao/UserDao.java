package com.tt.dao;

import com.tt.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by lx7ly on 9/16/16.
 */
public class UserDao {

    private SessionFactory sessionFactory;

    public void addUser(User user) {

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
