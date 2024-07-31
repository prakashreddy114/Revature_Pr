package com.twitter.controller;

import java.util.Scanner;

import com.twitter.entity.TwitterUser;
import com.twitter.service.TwitterService;
import com.twitter.service.TwitterServiceInterface;

public class TwitterController implements TwitterControllerInterface {

	public void createProfileController() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		
		TwitterUser tw=new TwitterUser();
		tw.setAddress(name);
		tw.setPassword(password);
		tw.setEmail(email);
		tw.setAddress(address);
		
		TwitterServiceInterface ti=new TwitterService();
		int i=ti.createProfile(tw);
		if(i>0) {
			System.out.println("profile created");
		}else {
			System.out.println("profile rejected");
		}
		

	}

	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	public void deleteProfileontroller() {
		// TODO Auto-generated method stub

	}

	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
