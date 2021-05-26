package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    private static Map<Integer, User> allUsers;

    private static int countId = 0;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name) &&
                sex == user.sex;
    }

    private boolean hasUser() {
        for (User user:allUsers.values()) {
            if (user.equals(this)){
                return true;
            }
        }
        return false;
    }

    public User(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        if (allUsers == null) {
            allUsers = new HashMap<>();
        }
        if (!hasUser()) {
            this.id = ++countId;
            allUsers.put(id, this);
        }
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUserBySex(Sex inputSex) {
        List<User> resultList = new ArrayList<>();
        for (User user : allUsers.values()) {
            if (user.getSex().equals(inputSex)) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public static int getUsersCount() {
        return allUsers.size();
    }

    public static int getUsersCountBySex(Sex inputSex) {
        return getAllUserBySex(inputSex).size();
    }

    public static double getUsersMiddleAge() {
        long ageSum = 0;
        for (User user : allUsers.values())
            ageSum += user.getAge();

        return (double) ageSum / allUsers.size();
    }

    public static double getUsersMiddleAgeBySex(Sex inputSex) {
        long ageSum = 0;
        int counter = 0;
        for (User user : allUsers.values()) {
            if (user.getSex().equals(inputSex)) {
                ageSum += user.getAge();
                counter++;
            }
        }
        return (double) ageSum / counter;
    }

    public int getAge() {
        return age;
    }

    public utils.Sex getSex() {
        return sex;
    }
}
