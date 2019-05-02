package by.it.tsyhanova.at22;

import by.it.tsyhanova.at22.beans.User;


import java.sql.SQLException;

import static by.it.tsyhanova.at22.Dao.TypeDao.MY_SQL;

public class Runner {
    public static void main(String[] args) throws SQLException {
        //ConnectionCreator connectionCreator=new ConnectionCreatorMySql();
        //чтение
        //заменяем пользовательский UserDao на Dao
        //UserDao userDao=new UserDao(connectionCreator); - прежний вариант
        //теперь везде используем dao
        Dao dao=new Dao(MY_SQL);
        User user = dao.user.read(3);
        System.out.println("user after reading: " + user);



        //запись
        user=new User(0,"test_username","test_password","test@mail.ru",user.getDate());
        dao.user.create(user);
        /*user.setUsername("test_name");
        userDao.create(user);//создаем из старого юзера нового*/
        System.out.println("user after creating: " + user);

        //проверим обновление
        user.setUsername("LOGIN_UPDATE");
        dao.user.update(user);
        user = dao.user.read(user.getId());
        System.out.println("user after update: " + user);

        //проверим удаление
        dao.user.delete(user);
        user = dao.user.read(user.getId());
        System.out.println("user after delete: " + user);


    }
}
