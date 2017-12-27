package kz.nuris.dao;

import kz.nuris.entities.City;
import kz.nuris.entities.Role;
import kz.nuris.entities.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by User on 27.12.2017.
 */
public interface UserDao extends Dao<User, Integer> {
    List<User> getUsersByCityId(Integer id);

    List<User> getUsersByRoleId(Integer id);

    User findUserByEmailAndPassword(String email , String password);

    User findUserByEmail(String email);
}
