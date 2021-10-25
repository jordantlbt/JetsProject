package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirField {

	AirField jts;
	private ArrayList<Jet> fleet = new ArrayList<>();
	String jetsFile = "jets.txt";
	Scanner userInput = new Scanner(System.in);

	public AirField(ArrayList<Jet> fleet) {
		super();
		this.fleet = fleet;

	}

	public void readJetsFromFile(ArrayList<Jet> fleet) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetsFile))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] lineSplit = line.split(",");
				if (lineSplit[0].equals("Cargo")) {
					CargoPlane cargoPlane = new CargoPlane(lineSplit[1], Double.parseDouble(lineSplit[2]),
							Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]));
					fleet.add(cargoPlane);
				} else if (lineSplit[0].equals("Fighter")) {
					FighterJet fighterJet = new FighterJet(lineSplit[1], Double.parseDouble(lineSplit[2]),
							Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]));
					fleet.add(fighterJet);
				} else if (lineSplit[0].equals("Passenger")) {
					PassengerJet passengerJet = new PassengerJet(lineSplit[1], Double.parseDouble(lineSplit[2]),
							Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]));
					fleet.add(passengerJet);

				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void displayAirfield(ArrayList<Jet> fleet) {
		if (fleet != null) {
			for (Jet jet : fleet) {
				System.out.println(jet);
			}
		}

	}

	public void fastestJet(ArrayList<Jet> fleet) {
		int fastestSpeed = 0;
		int index = 0;

		if (fleet.size() != 0) {
			for (int i = 0; i < fleet.size(); i++) {
				if (fleet.get(i).getSpeed() > fastestSpeed) {
					index = i;
					fastestSpeed = (int) fleet.get(i).getSpeed();
				}
			}
		}
		System.out.println("Fastest jet is " + fleet.get(index));
	}

	public void longestRange(ArrayList<Jet> fleet) {

		int longestRange = 0;
		int index = 0;

		if (fleet.size() != 0) {
			for (int i = 0; i < fleet.size(); i++) {
				if (fleet.get(i).getRange() > longestRange) {
					index = i;
					longestRange = (int) fleet.get(i).getRange();
				}
			}
		}
		System.out.println("Jet with the longest range is " + fleet.get(index));

	}

	public void loadCargoPlane() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoPlane) {
				System.out.println(jet.toString());
				((CargoCarrier) jet).loadCargo();
			}

		}

	}

	public void fightJets() {

		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				System.out.println(jet.toString());
				((FighterJet) jet).fight();
			}

		}

	}

	public void addJet() {

		String type;
		String model;
		double speed;
		int range;
		double price;

		System.out.println("What type of jet would you like to add?");
		System.out.println("Fighter, Cargo, Passenger?");
		type = userInput.next();
		System.out.println("What is the model?");
		model = userInput.next();
		System.out.println("What is the speed?");
		speed = userInput.nextDouble();
		System.out.println("What is the range?");
		range = userInput.nextInt();
		System.out.println("What is the price?");
		price = userInput.nextDouble();

		if (type.equals("Cargo")) {
			CargoPlane cargoPlane = new CargoPlane(model, speed, range, price);
			fleet.add(cargoPlane);
		} else if (type.equals("Fighter")) {
			FighterJet fighterJet = new FighterJet(model, speed, range, price);
			fleet.add(fighterJet);
		} else if (type.equals("Passenger")) {
			PassengerJet passengerJet = new PassengerJet(model, speed, range, price);
			fleet.add(passengerJet);

		}

		System.out.println(fleet.toString());

	}

	public void removeJet() {

		int choice;

		System.out.println("Which jet would you like to remove?");
		System.out.println("List starts at number 1, please enter the number you would like to remove.");
		System.out.println(fleet.toString());
		choice = userInput.nextInt() - 1;
		fleet.remove(choice);
		System.out.println(fleet.toString());

	}

	public void jetsFlying() {
		for (Jet jet : fleet) {
			System.out.println("Preparing jets to fly");
			System.out.println("All jets are flying");
			System.out.println(jet);
			jet.fly();

		}

	}
}
