package by.it.agrinkevich.webcalculator.database.repo;

import by.it.agrinkevich.webcalculator.database.beans.User;
import by.it.agrinkevich.webcalculator.database.connection.ConnectionCreator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDAO implements InterfaceDAO<User> {

    private ConnectionCreator connectionCreator;

    public UserDAO(ConnectionCreator connectionCreator) {
        this.connectionCreator = connectionCreator;
    }

    @Override
    public User read(long id) throws SQLException {
        User user = null;
        String sql = String.format("SELECT * FROM `agrinkevich`.`user` WHERE id=%d", id);
        try (
                Connection connection = connectionCreator.get();
                Statement statement = connection.createStatement()
        ) {
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
    public boolean create(User user) throws SQLException {
        String sql = String.format("insert INTO `agrinkevich`.`user` (username, email, password, create_time)" +
                        "values ('%s','%s','%s','%s')",
                user.getUsername(), user.getEmail(), user.getPassword(), user.getDate()
        );

        try (
                Connection connection = connectionCreator.get();
                Statement statement = connection.createStatement()
        ) {
            if (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    long id = generatedKeys.getLong(1);
                    user.setId(id);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean update(User user) throws SQLException {
        String sql = String.format("update `agrinkevich`.`user` " +
                        " SET username='%s', email='%s', password='%s', create_time='%s'" +
                        " WHERE id='%d'",
                user.getUsername(), user.getEmail(), user.getPassword(), user.getDate(), user.getId()
        );

        try (
                Connection connection = connectionCreator.get();
                Statement statement = connection.createStatement()
        ) {
            return (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS));
        }
    }

    @Override
    public boolean delete(User user) throws SQLException {
        String sql = String.format("DELETE FROM `agrinkevich`.`user` " +
                " WHERE id='%d'", user.getId()
        );

        try (
                Connection connection = connectionCreator.get();
                Statement statement = connection.createStatement()
        ) {
            return (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS));
        }
    }

    @Override
    public List<User> getAll() throws SQLException {
        return null;
    }
}
