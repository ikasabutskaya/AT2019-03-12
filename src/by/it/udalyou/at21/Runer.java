package by.it.udalyou.at21;

import by.it.udalyou.at21Bean.User;

import java.sql.SQLException;

public class Runer {
    //прверка чтения
    public static void main(String[] args) throws SQLException {
        int i=2;
        UserDAO userDAO=new UserDAO();
        User user=userDAO.read(i);
        System.out.println("user after read id: "+i+" "+ user);

    }
}
