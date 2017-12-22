package kz.nuris;

import kz.nuris.entities.CityEntity;
import kz.nuris.entities.RoleEntity;
import kz.nuris.utils.HiberanteSessionFactoryUtil;
import org.hibernate.Session;

/**
 * Created by User on 22.12.2017.
 */
public class Main{
    public static void main(String[] args) {
        Session session = HiberanteSessionFactoryUtil.getSession();
        session.beginTransaction();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName("admin");
        session.save(roleEntity);
        session.getTransaction().commit();
    }
}
