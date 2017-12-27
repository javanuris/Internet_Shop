package kz.nuris.dao.impl;

import kz.nuris.dao.RoleDao;
import kz.nuris.entities.Role;
import kz.nuris.utils.HiberanteSessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.12.2017.
 */
public class RoleDaoImpl implements RoleDao{

    @Override
    public Role findById(Integer id) {
        Role role= null;
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            role = session.get(Role.class, id);
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return role;
    }

    @Override
    public List<Role> getAll() {
        List<Role> roles = new ArrayList<>();
        Session session = null;

        try {
            session = HiberanteSessionFactoryUtil.getSession();
            roles = session.createCriteria(Role.class).list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return roles;
    }

    @Override
    public Role save(Role entity) {
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
            Role role = session.load(Role.class, id);
            session.delete(role);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }
}
