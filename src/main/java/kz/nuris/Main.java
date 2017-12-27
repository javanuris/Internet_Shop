package kz.nuris;

import kz.nuris.dao.CityDao;
import kz.nuris.dao.RoleDao;
import kz.nuris.dao.UserDao;
import kz.nuris.dao.impl.CityDaoImpl;
import kz.nuris.dao.impl.RoleDaoImpl;
import kz.nuris.dao.impl.UserDaoImpl;
import kz.nuris.entities.*;
import kz.nuris.utils.HiberanteSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 22.12.2017.
 */
public class Main {
    public static void main(String[] args) {

        Statistics statistics = HiberanteSessionFactoryUtil.getSessionFactory().getStatistics();
        boolean statEnable = statistics.isStatisticsEnabled();
        statistics.setStatisticsEnabled(true);

        System.out.println("Open connect count : "+statistics.getSessionOpenCount());

        UserDao userDao = new UserDaoImpl();
        Role role = new Role();
        role.setId(1);

        User user = userDao.findById(1);
        user.setPhone("n.******@gmail.com");
        userDao.save(user);
        System.out.println(user);


        System.out.println("Close connect count : "+statistics.getSessionCloseCount());


    }
}
