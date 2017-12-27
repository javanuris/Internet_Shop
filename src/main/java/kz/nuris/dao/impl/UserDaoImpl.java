package kz.nuris.dao.impl;

import kz.nuris.dao.UserDao;
import kz.nuris.entities.User;
import kz.nuris.utils.HiberanteSessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.12.2017.
 */
public class UserDaoImpl implements UserDao {

    private static final String SELECT_USERS_BY_CITY_ID = "from User U where U.city.id = :city";
    private static final String SELECT_USERS_BY_ROLE_ID = "from User U where U.role.id = :role";
    private static final String SELECT_USER_BY_EMAIL = "from User U where U.email = :email";
    private static final String SELECT_USER_BY_EMAIL_AND_PASSWORD = "from User U where U.email = :email and U.password = :password";


    @Override
    public User findById(Integer id) {
        User user = null;
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            user = session.get(User.class, id);
        } finally {
            if (session != null && session.isOpen()) ;
            session.close();
        }
        return user;
    }

    @Override
    public List<User> getAll() {

        List<User> users = new ArrayList<>();
        Session session = null;

        try {
            session = HiberanteSessionFactoryUtil.getSession();
            users = session.createCriteria(User.class).list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return users;
    }

    @Override
    public User save(User entity) {
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            session.beginTransaction();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            session.beginTransaction();
            User user = session.load(User.class, id);
            session.delete(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public List<User> getUsersByCityId(Integer id) {
        List<User> users = new ArrayList<>();
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            Query query = session.createQuery(SELECT_USERS_BY_CITY_ID);
            query.setParameter("city", id);
            users = query.list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return users;
    }

    @Override
    public List<User> getUsersByRoleId(Integer id) {
        List<User> users = new ArrayList<>();
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            Query query = session.createQuery(SELECT_USERS_BY_ROLE_ID);
            query.setParameter("role", id);
            users = query.list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return users;
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        User user = null;
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            Query query = session.createQuery(SELECT_USER_BY_EMAIL_AND_PASSWORD);
            query.setParameter("email", email);
            query.setParameter("password", password);
            user = (User) query.uniqueResult();
        }finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return user;
    }

    @Override
    public User findUserByEmail(String email) {
        User user = null;
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            Query query = session.createQuery(SELECT_USER_BY_EMAIL);
            query.setParameter("email", email);
            user = (User) query.uniqueResult();
        }finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return user;
    }
}
