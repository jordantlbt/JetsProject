package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

	public void fight() {

		System.out.println("Ready to engage in fighting");
		System.out.println("Pew! Pew! Pew!");
	}

}
