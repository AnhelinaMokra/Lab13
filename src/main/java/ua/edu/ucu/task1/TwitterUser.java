package ua.edu.ucu.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwitterUser {
    private String userEmail;
    private String country;
    private String lastActiveTime;

    public String getEmail() {
        return userEmail;
    }
    public String getUserCoutry() {
        return country;
    }
    public String getUserActiveTime() {
        return lastActiveTime;
    }
}
