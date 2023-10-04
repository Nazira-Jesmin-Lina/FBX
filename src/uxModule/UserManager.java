package uxModule;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users = new HashMap<>();
    private User loggedInUser = null;

    public UserManager() {
    }

    public void signUp(String username, String password) { //method for signup a new user.
        if (!users.containsKey(username)) {
            User newUser = new User(username, password);
            users.put(username, newUser);
            System.out.println("Sign-up successful. You can now log in.");
        } else {
            System.out.println("Username already exists. Please choose another one.");
        }
    }

    public void login(String username, String password) {   //method for login an existing user.
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                loggedInUser = user;
                System.out.println("Login successful. Welcome, " + username + "!");
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please sign up or check your username.");
        }
    }

    public void logout() {
        loggedInUser = null;
        System.out.println("Logged out successfully.");
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
}
