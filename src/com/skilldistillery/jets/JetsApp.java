package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {
	
	//TWO Fields MAX
	
	private AirField airfield = new AirField();
	private Scanner keyboard = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launchApp();
		
	}
	
	public void launchApp() {
		
		boolean appOn = true;
		
		while (appOn)
		{
			displayUserMenu();
			
			int selection = keyboard.nextInt();
			
			switch(selection) {
			case 1:	// List Fleet
				airfield.printJets();
				break;
			case 2:
				airfield.flyFleet();

				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.out.println("Goodbye");
				appOn = false;
				break;
				
			}
			
			

			
			
		}
		
		
	}

	
	
	public void displayUserMenu() {
		
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View get with the longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Add a jet to fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
