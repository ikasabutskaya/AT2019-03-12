package by.it.romanova.at21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreatorMySql implements CreateConnectionCreator {
    static {
        try { //mysql-connector 8.0.15
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Not found Driver");
        }
    }

    private final String URL = "jdbc:mysql://127.0.0.1:3306/romanova?" +
            "useUnicode=true&" +
            "useJDBCCompliantTimezoneShift=true&" +
            "useLegacyDatetimeCode=false&" +
            "serverTimezone=UTC";
    private final String login = "root";
    private final String password = "12345678";


    @Override
    public Connection get() throws SQLException {
        return DriverManager.getConnection(
                URL,
                login,
                password);
    }
}
