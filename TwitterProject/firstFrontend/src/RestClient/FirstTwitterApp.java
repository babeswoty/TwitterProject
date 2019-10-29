package RestClient;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class FirstTwitterApp {
public static void main(String [] args) throws TwitterException {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("pcTtP7S1ysbntTuHwVPE5rjvP")
		.setOAuthConsumerSecret("vzg4GSvxgnUbqzXtrB9b5wuZOyDHPFg3ybcGJZFqaL500oEQPs ")
		.setOAuthAccessToken("1601672534-GB4KAJopaq1YQdXCagPqMmdl5B3qKQh3Fwnuc3w")
		.setOAuthAccessTokenSecret("5n4r8h5e7FIx1nqqIiSFwPpD9XQ2FjQRNXVEuB6tJ6ZD9");
		
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		
		public String createTweet(String tweet) throws TwitterException{
			
			Twitter twitter = getTwitterinstance();
			Status status = twitter.updateStatus("Posting a status testing");
			return status.getText();
			
		}
		
		public static String sendDirectMessage(String recipientName, String msg) throws Twitterexception{
			
			Twitter twitter = getTwitterinstance();
			DirectMessage message = twitter.sendDirectMessage("@AdhLecturer", "213656970 ADH project");
			
		}
		
	}
}
