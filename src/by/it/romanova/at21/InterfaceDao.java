package by.it.romanova.at21;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDao<T> {
    T read(long id) throws SQLException;
    boolean create(T bean) throws SQLException;
    boolean update(T bean) throws SQLException;
    boolean delete(T bean) throws SQLException;
    List<T> getAll() throws SQLException;
}
