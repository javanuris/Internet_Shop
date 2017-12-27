package kz.nuris.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 26.12.2017.
 */
public interface Dao<T, ID> {

    T findById(ID id);

    List<T> getAll();

    T save(T entity);

    void delete(Integer id);

}
