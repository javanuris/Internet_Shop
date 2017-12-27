package kz.nuris.dao.impl;

import kz.nuris.dao.CityDao;
import kz.nuris.entities.City;
import kz.nuris.utils.HiberanteSessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.12.2017.
 */
public class CityDaoImpl implements CityDao {
    @Override
    public City findById(Integer id) {
        City city = null;
        Session session = null;
        try {
            session = HiberanteSessionFactoryUtil.getSession();
            city = session.get(City.class, id);
        } finally {
            if (session != null && session.isOpen());
               session.close();
        }
        return city;
    }

    @Override
    public List<City> getAll() {
        List<City> cities = new ArrayList<>();
        Session session = null;

        try {
            session = HiberanteSessionFactoryUtil.getSession();
            cities = session.createCriteria(City.class).list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return cities;
    }

    @Override
    public City save(City entity) {
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
            City city = session.load(City.class, id);
            session.delete(city);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }
}
