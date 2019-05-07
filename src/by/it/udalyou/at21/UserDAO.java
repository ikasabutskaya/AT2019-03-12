package by.it.udalyou.at21;

import by.it.udalyou.at21Bean.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDAO implements interfaseDAO <User> {
    @Override
    public User read(long id) throws SQLException {
        User user = null;
        String sql = "SELECT * FROM udalyou.user WHERE id=" + id;
        ConnectionCreator connectionCreator = new ConnectionCreatorMySQL();
        try   (
                Connection connection = connectionCreator.get();
                 Statement statement = connection.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getDate("create_time")
                );
            }
        }
            return user;
    }
    @Override
    public boolean create(User bean) throws SQLException {
        return false;
    }

    @Override
    public boolean update(User bean) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(User bean) throws SQLException {
        return false;
    }

    @Override
    public List<User> getAll() throws SQLException {
        return null;
    }
}

