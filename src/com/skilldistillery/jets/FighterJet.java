package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Model: " + this.getModel());
		System.out.println("Speed: " + this.getSpeed());
		System.out.println("Range: " + this.getRange());
		System.out.println("Price: " + this.getPrice());
		double time;
		// velocity = Range / time
		//time = Range / velocity
		time = this.getRange()/this.getSpeed();
		System.out.println("Amount of flight time until fuel runs out: " + time);
			
	}
	
	

}
