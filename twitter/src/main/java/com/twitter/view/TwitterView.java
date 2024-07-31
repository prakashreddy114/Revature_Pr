package com.twitter.view;

import java.util.Scanner;

import com.twitter.controller.TwitterController;
import com.twitter.controller.TwitterControllerInterface;



public class TwitterView {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("********Main Menu********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		System.out.println("press 7 to login profile");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		
		int c=sc.nextInt();
		
		// view want to interact with controller  so it must interact using low coupling which is known a sInterface
		TwitterControllerInterface tw= new TwitterController();
	
		
		switch(c) {
		case 1:  tw.createProfileController();
			break;
		case 2:  tw.viewProfileController();
			break;
		case 3:  tw.deleteProfileontroller();
			break;
		case 4:  tw.editProfileController();
			break;
		case 5:  tw.searchProfileController();
			break;
		case 6:  tw.viewAllProfileController();
			break;
		case 7:  tw.loginProfileController();
			break;
			default : System.out.println("wrong choice");
		}


		


	}

	}

}
