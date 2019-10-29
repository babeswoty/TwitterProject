package modeltweet;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import entities.SimpleObjects;
import restService.restServiceEJB;

public class tweetmodel implements Serializable{
	 private static final long serialVersionUID = 1L;
	 

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long tweetid;
	public String tweet;
	public String recipientName ;
	public String msg;
	public Date timestamp;
	

	public Long getTweetid() {
		return tweetid;
	}

	public void setTweetid(Long tweetid) {
		this.tweetid = tweetid;
	}

	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweet) {
		this.tweet = tweet;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	
	 public String addNewTweet() {
         
		restServiceEJB.addNew(restServiceEJB.getEntity());
     
        return "tweet";
    }
	 
	 public SimpleObjects getEntity()
     {
    	 SimpleObjects  SimpleObjects = new  SimpleObjects();
                    SimpleObjects.setTweet(tweet);
                    SimpleObjects.setRecipientName(recipientName);
                    SimpleObjects.setMsg(msg);
                    SimpleObjects.setTimestamp(timestamp);
                    SimpleObjects.setTweetid(tweetid);
                    return  SimpleObjects;
     }
     
	
	}
     
    
   
     



