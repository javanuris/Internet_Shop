package kz.nuris.services;

import kz.nuris.entities.User;

/**
 * Created by User on 27.12.2017.
 */
public interface UserService {

    void registerUser(User user);

    void deleteUser(User user);

    boolean checkExistEmail();

    User findUserByEmailAndPassword();


}
