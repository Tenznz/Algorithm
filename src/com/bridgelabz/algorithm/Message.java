package com.bridgelabz.algorithm;

import java.util.Date;
import java.util.Scanner;

public class Message {
	public static Message instance;

	private Message() {

	}

	public static Message getInstance() {
		if (instance == null) {
			instance = new Message();
		}
		return instance;
	}

	public void input() {
		UserData user = UserData.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		String fName = sc.next();
		user.setFirstName(fName);
		System.out.print("Enter Last Name : ");
		String lName = sc.next();
		user.setLastName(lName);
		
		addPhoneNumber();//adding valid phone number

	}

	public void addPhoneNumber() {
		UserData user = UserData.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Phone Number (Eg.91-9919819801) : ");
		String phoneNumber = sc.nextLine();
		boolean check = phoneNumber.matches("^([0-9]{1,2})-([0-9]{10})$");
		if (check == true) {
			user.setPhoneNumber(phoneNumber);

		} else {
			System.out.println("Invalid Phone Number format \nAdd again (Eg:91-9919819801)");
			addPhoneNumber();
		}
	}

	public void display() {

		Date date = new Date();
		UserData user = UserData.getInstance();
		System.out.println("Hello " + user.getLastName() + ", We have your full\n" + user.getFirstName()
				+ user.getLastName() + " in our system. your contact number is " + user.getPhoneNumber() + ".\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz\nDate  : " + date + ".");

	}

}
