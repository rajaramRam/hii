package org.scan;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter Student Reg Id");
		String userId = userInput.nextLine();
		System.out.println("Student Id:" + userId);

		System.out.println("Enter Student Name");
		String userName = userInput.nextLine();
		System.out.println("Student Name:" + userName);

		System.out.println(" Enter Your Mail");
		String userMail = userInput.nextLine();
		System.out.println("Student Mail:" + userMail);

		System.out.println("Enter your Phno");
		long userNum = userInput.nextLong();
		System.out.println("Student Number:" + userNum);

		userInput.nextLine();
		System.out.println("Enter your Dept");
		String userDept = userInput.nextLine();
		System.out.println("Student Department:" + userDept);

		System.out.println("Enter your Gender");
		String userGender = userInput.nextLine();
		System.out.println("Student Gender:" + userGender);

		System.out.println("Enter your City");
		String userCity = userInput.nextLine();
		System.out.println("Student City:" + userCity);

		System.out.println("Enter a values");

		System.out.println("Enter a values");

		System.out.println("Enter a values");

		System.out.println("Enter a values");

		System.out.println("Enter a values");

		System.out.println("Enter a values");

		System.out.println("Enter a values");

	}
}
