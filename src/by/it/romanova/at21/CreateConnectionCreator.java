package by.it.romanova.at21;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateConnectionCreator {
    Connection get() throws SQLException;
}
