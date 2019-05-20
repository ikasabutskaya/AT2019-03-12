package by.it.agrinkevich.at21;

import by.it.agrinkevich.at21.beans.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class UserDAOTest {

    @Test
    public void UserDaoTest() throws SQLException{

        //create check
        UserDAO userDao = new UserDAO();
        Date date = Timestamp.valueOf(LocalDateTime.now());
        User user = new User(0, "Alina", "12345", "grinkevich.alina@gmail.com", date);
        userDao.create(user);
        user = userDao.read(user.getId());
        System.out.println("Created user: "+ user);
        Assert.assertEquals("Username is incorrect","Alina",user.getUsername());
        Assert.assertEquals("Password is incorrect","12345",user.getPassword());
        Assert.assertEquals("Email is incorrect","grinkevich.alina@gmail.com",user.getEmail());
        //Assert.assertEquals("Date is incorrect",date,user.getDate());

        //check update
        user.setUsername("Kate");
        userDao.update(user);
        user = userDao.read(user.getId());
        System.out.println("Updated user: "+ user);
        Assert.assertEquals("Username is not updated","Kate",user.getUsername());

        //check delete
        userDao.delete(user);
        user = userDao.read(user.getId());
        Assert.assertEquals("User still exists",null, user);
    }
}
