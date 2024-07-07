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
			case 2:	//Fly All Jets
				airfield.flyFleet();

				break;
			case 3:	//View fastest jet
				airfield.viewFastestJet();
				break;
			case 4:	//View Farthest Range
				airfield.viewFarthestRange();
				break;
			case 5: //Load Cargo Jets
				airfield.loadCargo();
				break;
			case 6:	//Dogfight
				airfield.dogfight();
				break;
			case 7:	///Add a jet to fleet
				
				System.out.println("Enter Type, c for Cargo, f for fighter, p for passenger jet");
				String type = keyboard.next();
				
				System.out.println("Enter Model: ");
				String model = keyboard.next();

				System.out.println("Enter Speed: ");
				double speed = keyboard.nextDouble();
				System.out.println("Enter Range: ");
				int range = keyboard.nextInt();

				System.out.println("Enter Price: ");
				long price = keyboard.nextLong();
				

				if (type.equals("c"))
				{
					airfield.addCargoJet(model ,speed, range, price);
				}
				else if(type.equals("f"))
				{
					airfield.addFighterJet(model ,speed, range, price);

				}
				else if(type.equals("p"))
				{
					airfield.addJetImpl(model ,speed, range, price);

				}
				else
				{
					System.out.println("Wrong input");
				}
				
				Jet j = new JetImpl("Boeing 747", 564, 5380, 250000000);
				break;
			case 8:	//Remove a jet to fleet
				airfield.printIndexes();
				System.out.println("Which index do you want to remove?");
				int index = keyboard.nextInt();
				airfield.removeIndex(index);
				break;
			case 9:
				System.out.println("Goodbye");
				appOn = false;
				break;
				
			}
			
			

			
			
		}
		
		
	}

	
	
	public void displayUserMenu() {
		System.out.println("--------------------------------------------");

		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View get with the longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Add a jet to fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println("--------------------------------------------");

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
