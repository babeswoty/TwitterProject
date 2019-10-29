package entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name="sentTweets_tbl")
public class SimpleObjects {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long tweetid;
	public String tweet;
	public String recipientName ;
	public String msg;
	public Date timestamp;
	

	public SimpleObjects() {
		// TODO Auto-generated constructor stub
	}

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


	
	}

	



