package by.it.tsyhanova.at21;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionCreatorMySql implements ConnectionCreator {
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("Not found Driver");
        }
    }

    @Override
    public Connection get() throws SQLException {
        return null;
    }
}
