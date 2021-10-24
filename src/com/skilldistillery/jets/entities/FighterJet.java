package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);
	}

	public void fight() {

		System.out.println("Ready to engage in fighting");
		System.out.println("Pew! Pew! Pew!");
	}

}
