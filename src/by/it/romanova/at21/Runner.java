package by.it.romanova.at21;

import by.it.romanova.at21.beans.User;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDao();
        User user = userDao.read(3);
        System.out.println(user);

        user.setUsername("la la la");
        userDao.create(user);

    }
}
