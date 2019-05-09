package by.it.udalyou.at21;

import by.it.akhmelev.at21.UserDao;
import by.it.udalyou.at21.beans.User;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class Runer<date> {
    //прверка чтения
    public static void main(String[] args) throws SQLException {
        int i = 1;
        UserDAO userDAO = new UserDAO();
        User user = userDAO.read(i);
        System.out.println("user after read id: " + i + " " + user);

      /*  UserDao userDao = new UserDao();
        by.it.akhmelev.at21.beans.User userA = userDao.read(3);
        System.out.println("user after read 3: " + userA);*/

        // проверка создания
     /*   Date date = Timestamp.valueOf(LocalDateTime.now());
        user = new User(0, "new_user", "852369", "fghjk@tut.by", date);
       // user = new User(0, "NEW_LOGIN", "NEW_PASSWORD", "NEW_EMAIL", date);

        userDAO.create(user);
        user=userDAO.read(user.getId());

        System.out.println("user after create: " + user);*/

        //проверим обновление
        user.setUsername("LOGIN_UPDATE");
        userDAO.update(user);
        user = userDAO.read(user.getId());
        System.out.println("user after update: " + user);

        user.setUsername("default");
        userDAO.update(user);
        user = userDAO.read(user.getId());
        System.out.println("user after update: " + user);

        //проверим удаление
     //   userDAO.delete(user);
      //  user = userDAO.read(user.getId());
      //  System.out.println("user after delete: " + user);
    }
}
