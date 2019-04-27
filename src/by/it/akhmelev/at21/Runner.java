package by.it.akhmelev.at21;

import by.it.akhmelev.at21.beans.User;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDao();
        User user = userDao.read(3);
        user=new User(0, "LLLL", "EEEE", "PPPPP", user.getDate());
        userDao.create(user);
        System.out.println(user);
    }
}
