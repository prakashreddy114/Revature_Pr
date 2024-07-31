package com.twitter.service;

import com.twitter.dao.TwitterappDAO;
import com.twitter.dao.TwitterappDAOInterface;
import com.twitter.entity.TwitterUser;

public class TwitterService implements TwitterServiceInterface {

	public int createProfile(TwitterUser tw) {
		// TODO Auto-generated method stub
		TwitterappDAOInterface td=new TwitterappDAO();
		int i=td.createProfileDAO(td);
		
		return i;
	}

}
