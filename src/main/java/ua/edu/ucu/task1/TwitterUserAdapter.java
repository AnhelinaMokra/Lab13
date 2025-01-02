package ua.edu.ucu.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class TwitterUserAdapter implements User{
    private TwitterUser user;

    @Override
    public String getMail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCoutry();
    }

    @Override
    public String getActiveTime() {
        return user.getUserActiveTime();
    }

}
