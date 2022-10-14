package day13;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> subscribes;

    public User(String username) {
        this.username = username;
        subscribes = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<User> getSubscribes() {
        return subscribes;
    }

    public void subscribe(User user) {
        subscribes.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscribes.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}