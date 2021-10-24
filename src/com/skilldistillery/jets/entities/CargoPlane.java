package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);
	}

	public void loadCargo() {

		System.out.println("Now loading aircraft....");
		System.out.println("Finished loading aircraft.");

	}

}
