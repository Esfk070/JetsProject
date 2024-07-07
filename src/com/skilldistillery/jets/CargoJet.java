package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println("--------------------------------------------");

		System.out.println(this.getModel() + " is loading cargo");
		System.out.println("--------------------------------------------");

		
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
