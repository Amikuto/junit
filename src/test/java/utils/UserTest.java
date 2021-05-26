package utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    public void GetAllUsers() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        List<User> excepted = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void getAllUserBySex() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        List<User> actual = User.getAllUserBySex(Sex.FEMALE);

        List<User> expected = new ArrayList<>();
        expected.add(user1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUsersCount() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        int actual = User.getUsersCount();
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUsersCountBySex() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        int actual = User.getUsersCountBySex(Sex.MALE);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUsersMiddleAge() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        double actual = User.getUsersMiddleAge();
        double expected = 20.333;

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getUsersMiddleAgeBySex() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        double actual = User.getUsersMiddleAgeBySex(Sex.MALE);
        double expected = 21.;

        Assert.assertEquals(expected, actual, 0.01);
    }
}