package com.tt.test;

import com.tt.model.User;
import com.tt.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by lx7ly on 9/15/16.
 */
public class UserManager {
    public static void main(String[] args) {
        UserManager mgr = new UserManager();

        mgr.createAndStoreUser("ttang", "123");

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreUser(String name, String password) {
        //使用getcurrentsession需要在hibernate的配置文件配置session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User theUser = new User();
        theUser.setName(name);
        theUser.setPassword(password);
        session.save(theUser);

        session.getTransaction().commit();
    }

}
