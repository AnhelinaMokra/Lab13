package ua.edu.ucu.task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.TWITTER;

        User user = null;
        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("facebook@email", "Ukraine", LocalDate.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("twitter@email", "USA", LocalDate.now().toString());
                user = new TwitterUserAdapter(twitterUser);
                break;
            default:
                break;

        }
        if (user instanceof FacebookUserAdapter) {
            System.out.println("Facebook");
        } else if (user instanceof TwitterUserAdapter) {
            System.out.println("Twitter");
        } else {
            System.out.println("Unknown or Google)");
        }
        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello World!");
    }
}
