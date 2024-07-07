package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	
	//THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS!!!!
	
	private ArrayList<Jet> jets;
	
	public AirField() {
		jets = new ArrayList<>();
		//TODO create 5 different jet objects, add them to list
		Jet j1 = new CargoJet("C130", 360, 2000, 14000000);
		Jet j2 = new CargoJet("C17", 520, 2400, 340000000);
		Jet j3 = new FighterJet("F16",1300, 2000,63000000);
		Jet j4 = new FighterJet("F35", 800, 1500, 82000000);
		Jet j5 = new JetImpl("Boeing 747", 564, 5380, 250000000);
		
		jets.add(j1);
		jets.add(j2);
		jets.add(j3);
		jets.add(j4);
		jets.add(j5);
		////////////START HERE*********
	
		//DO NOT CREATE A getJets() method
		
		//add jet methods that accepts an argument for a jet and adds it to the list
		
	}
	public void flyFleet()
	{
		for (Jet j : jets)
		{
			System.out.println("--------------------------------------------");			
			j.fly();
			System.out.println("--------------------------------------------");

		}
		
	}
	public void printJets()
	{
		for (Jet j : jets)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Model: "+ j.getModel());
			System.out.println("Speed: "+ j.getSpeed());
			System.out.println("Range: "+ j.getRange());
			System.out.println("Price: "+ j.getPrice());
			System.out.println("--------------------------------------------");

		}
	}
	public void viewFastestJet()
	{
		double fastest = 0;
		Jet fastestJet = null;
		for (Jet j : jets)
		{
			if (j.getSpeed() > fastest)
			{
				fastest = j.getSpeed();
				fastestJet = j;
			}
		}
		System.out.println("--------------------------------------------");

		System.out.println("Model: " + fastestJet.getModel());
		System.out.println("Speed: " + fastestJet.getSpeed());
		System.out.println("Range: " + fastestJet.getRange());
		System.out.println("Price: " + fastestJet.getPrice());
		System.out.println("--------------------------------------------");

	}
	public void viewFarthestRange()
	{
		double rangeMax = 0;
		Jet rangeJet = null;
		for (Jet j : jets)
		{
			if (j.getRange() > rangeMax)
			{
				rangeMax = j.getRange();
				rangeJet = j;
			}
		}
		System.out.println("--------------------------------------------");

		System.out.println("Model: " + rangeJet.getModel());
		System.out.println("Speed: " + rangeJet.getSpeed());
		System.out.println("Range: " + rangeJet.getRange());
		System.out.println("Price: " + rangeJet.getPrice());
		System.out.println("--------------------------------------------");

	}
	

	public void loadCargo()
	{
		for (Jet j : jets)
		{
			if (j instanceof CargoJet)
			{
				((CargoJet) j).loadCargo();
			}
		}
		
	}
	public void dogfight()
	{
		for (Jet j : jets)
		{
			if (j instanceof CombatReady)
			{
				((CombatReady) j).fight();
			}
		}
		
	}
	
	public void addCargoJet(String model, double speed, int range, long price)
	{
		Jet j = new CargoJet(model, speed, range, price);
		jets.add(j);

	}
	public void addFighterJet(String model, double speed, int range, long price)
	{
		Jet j = new FighterJet(model, speed, range, price);
		jets.add(j);
		
	}
	public void addJetImpl(String model, double speed, int range, long price)
	{
		Jet j = new JetImpl(model, speed, range, price);
		jets.add(j);
		
	}
	
}
