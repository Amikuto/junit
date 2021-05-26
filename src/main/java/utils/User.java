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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(age, user.age) && Objects.equals(sex, user.sex);
//    }


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

    public static ArrayList<User> getAllUserBySex() {
        return new ArrayList<>(allUsers.values());
    }

    //    public User(Long id, String userName, Integer age, String sex) {
//        this.id = id;
//        this.userName = userName;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    @Override
//    public String toString() {
//        return "utils.User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", age=" + age +
//                ", sex='" + sex + '\'' +
//                '}';
//    }
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        utils.User user = (utils.User) o;
////        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(age, user.age) && Objects.equals(sex, user.sex);
////    }
////
////    @Override
////    public int hashCode() {
////        return Objects.hash(id, userName, age, sex);
////    }
}
