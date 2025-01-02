package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.task1.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class task1_test {

    private MessageSender messageSender;
    private FacebookUser facebookUser;
    private TwitterUser twitterUser;

    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();
        facebookUser = new FacebookUser("user1@facebook.com", "USA", "2024-12-06T10:00:00");
        twitterUser = new TwitterUser("user2@twitter.com", "Canada", "2024-12-05T15:30:00");
    }

    @Test
    void testFacebookUserAdapter() {
        User facebookAdapter = new FacebookUserAdapter(facebookUser);

        assertEquals("user1@facebook.com", facebookAdapter.getMail());
        assertEquals("USA", facebookAdapter.getCountry());
        assertEquals("2024-12-06T10:00:00", facebookAdapter.getActiveTime());

        messageSender.send(facebookAdapter, "Hello from Facebook!");
    }

    @Test
    void testTwitterUserAdapter() {
        User twitterAdapter = new TwitterUserAdapter(twitterUser);

        assertEquals("user2@twitter.com", twitterAdapter.getMail());
        assertEquals("Canada", twitterAdapter.getCountry());
        assertEquals("2024-12-05T15:30:00", twitterAdapter.getActiveTime());

        messageSender.send(twitterAdapter, "Hello from Twitter!");
    }
}