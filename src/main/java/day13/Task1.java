package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hello!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "I'm fine");
        user2.sendMessage(user1, "Thanks");
        user2.sendMessage(user1, "And you?");
        user3.sendMessage(user1, "Hello");
        user3.sendMessage(user1, "Java");
        user3.sendMessage(user1, "World");
        user1.sendMessage(user3, "What?");
        user1.sendMessage(user3, "Who?");
        user1.sendMessage(user3, "How?");
        user3.sendMessage(user1, "Yes");

        MessageDatabase.showDialog(user1, user3);

    }
}
