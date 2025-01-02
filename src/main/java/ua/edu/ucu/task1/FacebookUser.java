package ua.edu.ucu.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCoutry;
    private String userActiveTime;

    public String getEmail() {
        return email;
    }

    public String getUserActiveTime() {
        return userActiveTime;
    }

    public String getUserCoutry() {
        return userCoutry;
    }
}
