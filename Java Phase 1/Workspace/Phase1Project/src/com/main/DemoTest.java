package com.main;

import java.util.Scanner;

import com.service.FileOperation;

public class DemoTest {

	public static void subOption() {
		FileOperation op1 =new FileOperation();
		Scanner obj1 = new Scanner(System.in);
		String con1 = null;
		do {
			System.out.println("1: Add New File 2 : Delete file 3 : Search File");
			System.out.println("Enter your choice");
			int choice = obj1.nextInt();
			switch(choice) {
			case 1 : op1.addFileName();
					break;
			case 2 : op1.deleteFile();
					break;
			case 3 : op1.searchFile();
					break;
			default:System.out.println("Wrong choice");
			       break;
			}
			System.out.println("do you want to continue in Sub option (y/n)");
			con1 = obj1.next();
		} while (con1.equalsIgnoreCase("y"));
	}
	public static void main(String[] args) {
		FileOperation fo = new FileOperation();
		int choice;
		String con=null;
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome Company Lockers Pvt. Ltd. Phase 1 project");
		do {
			System.out.println("1: Display all file in Ascending Order 2: Sub Option 3: Exit");
			System.out.println("Enter your choice");
			choice = obj.nextInt();
			switch (choice) {
			case 1: fo.displayAllFileInAscendingOrder();
					break;
			case 2 :  subOption();
					 break;
				
			case 3 :System.out.println("Thank you!"); 
					System.exit(0);
					break;
			default:System.out.println("wrong choice");
			         break;
			}
			System.out.println("Do you want to continue?(y/n)");
			con= obj.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you Visit again!");
	}

}
