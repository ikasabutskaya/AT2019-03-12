package by.it.agrinkevich.webcalculator.database.repo;


import by.it.agrinkevich.webcalculator.database.beans.Category;
import by.it.agrinkevich.webcalculator.database.connection.ConnectionCreator;

import java.sql.SQLException;
import java.util.List;

public class CategoryDAO implements InterfaceDAO<Category> {
    private ConnectionCreator connectionCreator;

    public CategoryDAO(ConnectionCreator connectionCreator) {
        this.connectionCreator=connectionCreator;
    }

    @Override
    public Category read(long id) throws SQLException {
        return null;
    }

    @Override
    public boolean create(Category bean) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Category bean) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Category bean) throws SQLException {
        return false;
    }

    @Override
    public List<Category> getAll() throws SQLException {
        return null;
    }
}
