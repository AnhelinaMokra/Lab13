package ua.edu.ucu.task1;

public class MessageSender {
    public void send(User user, String message) {
        System.out.println("New message was sent to " + user.getMail());
        System.out.println("Text: " + message);
        System.out.println("From: " + user.getCountry());
        System.out.println("Last Time Online: " + user.getActiveTime());
    }
}
