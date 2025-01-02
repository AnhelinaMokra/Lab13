package ua.edu.ucu.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class FacebookUserAdapter implements User {
    private FacebookUser facebookUser;


    @Override
    public String getMail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCoutry();
    }

    @Override
    public String getActiveTime() {
        return facebookUser.getUserActiveTime();
    }

}
