package utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    public void testGetAllUsers() {
        User user = new User("Евгений", 12, Sex.MALE);
        User user1 = new User("Маша", 19, Sex.FEMALE);
        User user2 = new User("Петя", 30, Sex.MALE);

        List<User> exceptet = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(exceptet, actual);
    }

    @Test
    public void testGetAllUserBySex() {
    }
}