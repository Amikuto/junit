//import utils.User;
//
//import java.util.ArrayList;
//import java.util.Map;
//
//public class UserList {
////    utils.User user;
//    ArrayList<User> users;
//    Map<Long, User> usersMap;
//
//    public void addUser(User user) {
//        users.add(user);
//        usersMap.put(user.getId(), user);
//    }
//
//    public ArrayList<User> getUsersBySex(String sex) {
//        ArrayList<User> output = new ArrayList<User>();
//        for (User selectedUser : users) {
//            if (selectedUser.getSex().equals(sex)) {
//                output.add(selectedUser);
//            }
//        }
//        return output;
//    }
//
//    public ArrayList<User> getUsersBySexMap(String sex) {
//        ArrayList<User> output = new ArrayList<User>();
//        for(Map.Entry<Long, User> entry : usersMap.entrySet()) {
//            Long key = entry.getKey();
//            User value = entry.getValue();
//
//            if (value.getSex().equals(sex)){
//                output.add(value);
//            }
//        }
//        return output;
//    }
//
//    public ArrayList<User> getAllUsers() {
//        return users;
//    }
//
//    public Integer getTotalUsers() {
//        return users.size();
//    }
//
//    public Integer getTotalBySex(String sex) {
//        Integer numOfUser = 0;
//        for (User selectedUser : users) {
//            if (selectedUser.getSex().equals(sex)) {
//                numOfUser++;
//            }
//        }
//        return numOfUser;
//    }
//
//    public Double getAvgUserAge() {
//        double userAge = 0.;
//        for (User selectedUser : users) {
//            userAge = userAge + selectedUser.getAge();
//        }
//        userAge = userAge / users.size();
//        return userAge;
//    }
//
//    public Double getAvgUserAgeBySex(String sex) {
//        ArrayList<User> sortedUsers = getUsersBySex(sex);
//        double userAge = 0.;
//        for (User selectedUser : sortedUsers) {
//            userAge = userAge + selectedUser.getAge();
//        }
//        userAge = userAge / sortedUsers.size();
//        return userAge;
//    }
//
//    public boolean equals(User user1, User user2) {
//        return user1.equals(user2);
//    }
//}
